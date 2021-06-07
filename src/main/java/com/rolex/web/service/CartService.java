package com.rolex.web.service;

import com.rolex.web.model.Cart;
import com.rolex.web.model.CartDetail;
import com.rolex.web.model.Customer;
import com.rolex.web.model.Product;
import com.rolex.web.repository.CartDetailRepository;
import com.rolex.web.repository.CartRepository;
import com.rolex.web.repository.CustomerRepository;
import com.rolex.web.repository.ProductRepository;
import com.rolex.web.viewmodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CartDetailRepository cartDetailRepository;
    @Autowired
    CustomerRepository customerRepository;


    public List<AdminOrderVM> getOrderList() {
        List<Cart> orderList = cartRepository.findAll();
        List<AdminOrderVM> orderVMList = new ArrayList<>();
        for (Cart item :
                orderList) {
            AdminOrderVM avm = new AdminOrderVM() {{
                setCartID(item.getCartID());
                setState(item.getState());
                setDeliveryDate(item.getDeliveryDate());
                setAddress(customerRepository.findByCustomerID(item.getCustomerID()).getAddress());
                setEmail(customerRepository.findByCustomerID(item.getCustomerID()).getEmail());
                setPrice(getTotalCost(item.getCartID()));
            }};
            orderVMList.add(avm);
        }
        return orderVMList;
    }

    public List<AddToCartForm> addToTempCart(List<AddToCartForm> cartList, AddToCartForm addToCartForm) {
        for (AddToCartForm form :
                cartList) {
            if (form.getpID().equals(addToCartForm.getpID())) {
                form.setQuantity(form.getQuantity() + addToCartForm.getQuantity());
                return cartList;
            }
        }
        cartList.add(addToCartForm);
        return cartList;
    }

    public List<AddToCartForm> updateQuantity(List<AddToCartForm> cartList, CartQuantityForm cartForm) {
        List<AddToCartForm> updatedCartList = new ArrayList<>();
        for (AddToCartForm cartItem :
                cartList) {
            for (AddToCartForm cartFormItem :
                    cartForm.getCartList()) {
                if (cartItem.getpID().equals(cartFormItem.getpID())) {
                    if (cartFormItem.getQuantity() != 0) {
                        cartItem.setQuantity(cartFormItem.getQuantity());
                        updatedCartList.add(cartItem);
                    }
                    break;
                }
            }
        }
        return updatedCartList;
    }

    public List<CheckoutProductVM> getCartFromSession(List<AddToCartForm> cartList) {
        List<CheckoutProductVM> checkoutProductVMList = new ArrayList<>();
        for (AddToCartForm cartItem :
                cartList) {
            Product product = productRepository.findFirstByProductID(cartItem.getpID());
            CheckoutProductVM cvm = new CheckoutProductVM() {{
                setProductID(product.getProductID());
                setPrice(product.getPrice());
                setProductName(product.getProductName());
                setQuantity(cartItem.getQuantity());
                setImg(product.getImg());
            }};

            checkoutProductVMList.add(cvm);
        }
        return checkoutProductVMList;
    }

    public int getTotalCost(List<AddToCartForm> cartList) {
        int total = 0;
        List<CheckoutProductVM> checkoutProductVMList = new ArrayList<>();
        for (AddToCartForm cartItem :
                cartList) {
            Product product = productRepository.findFirstByProductID(cartItem.getpID());
            total += product.getPrice() * cartItem.getQuantity();
        }

        return total;
    }

    public int getTotalCost(String cartID) {
        int total = 0;
        List<CartDetail> cartDetails = cartDetailRepository.findAllByCartID(cartID);
        for (CartDetail item :
                cartDetails) {
            total += item.getQuantity() * productRepository.findFirstByProductID(item.getProductID()).getPrice();
        }
        return total;
    }

    public void createOrder(String customerID, List<AddToCartForm> cartList) {
        Cart cart = new Cart();
        cart.setCustomerID(customerID);
        cart.setState("Being delivered");
        cart.setDeliveryDate(LocalDate.now());
        cartRepository.insert(cart);

        for (AddToCartForm cartItem :
                cartList) {
            CartDetail cartDetail = new CartDetail();
            cartDetail.setCartID(cart.getCartID());
            cartDetail.setProductID(cartItem.getpID());
            cartDetail.setQuantity(cartItem.getQuantity());
            cartDetailRepository.insert(cartDetail);
        }
    }

    public OrderVM getOrderFromCustomerID(String customerID) {
        Cart cart = cartRepository.findByCustomerID(customerID);
        Customer customer = customerRepository.findByCustomerID(customerID);

        return new OrderVM() {{
            setCartID(cart.getCartID());
            setState(cart.getState());
            setDeliveryDate(cart.getDeliveryDate());
            setAddress(customer.getAddress());
            setTotal(getTotalCost(cart.getCartID()));
        }};

    }

    public List<OrderCartDetailVM> getCartListFromCustomerID(String customerID) {
        Cart cart = cartRepository.findByCustomerID(customerID);
        List<OrderCartDetailVM> cartDetailVMS = new ArrayList<>();
        List<CartDetail> cartDetails = cartDetailRepository.findAllByCartID(cart.getCartID());
        for (CartDetail item :
                cartDetails) {
            OrderCartDetailVM ovm = new OrderCartDetailVM() {{
                setPrice(productRepository.findFirstByProductID(item.getProductID()).getPrice());
                setQuantity(item.getQuantity());
                setProductName(productRepository.findFirstByProductID(item.getProductID()).getProductName());
            }};
            cartDetailVMS.add(ovm);

        }
        return cartDetailVMS;
    }
}
