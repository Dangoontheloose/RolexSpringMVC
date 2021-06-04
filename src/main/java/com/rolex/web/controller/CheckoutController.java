package com.rolex.web.controller;

import com.rolex.web.model.ChargeRequest;
import com.rolex.web.service.CartService;
import com.rolex.web.service.CustomerService;
import com.rolex.web.service.ProductService;
import com.rolex.web.service.StripeService;
import com.rolex.web.viewmodel.AddToCartForm;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@PropertySource("classpath:application.properties")
public class CheckoutController {

    @Autowired
    private StripeService paymentsService;
    @Autowired
    private CartService cartService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProductService productService;

    @Value("${app.publicKey}")
    private String stripePublicKey;

    @RequestMapping("/checkout")
    public String checkout(Model model, HttpSession session) {
        if (session.getAttribute("email") == null){
            return "redirect:/login";
        }
        List<AddToCartForm> cartList = (List<AddToCartForm>) session.getAttribute("cart");
        if (cartList == null) {
            return "redirect:/home";
        }
        model.addAttribute("personalInfo", customerService.getCustomerByCustomerID((String) session.getAttribute("id")));
        model.addAttribute("checkoutInfo", cartService.getCartFromSession(cartList));
        model.addAttribute("total", cartService.getTotalCost(cartList));
        model.addAttribute("stripePublicKey", stripePublicKey);
        model.addAttribute("currency", ChargeRequest.Currency.VND);
        return "checkout";
    }

    @PostMapping("/charge")
    public String charge(ChargeRequest chargeRequest) throws StripeException {
        chargeRequest.setDescription("Example charge");
        chargeRequest.setCurrency(ChargeRequest.Currency.VND);
        Charge charge = paymentsService.charge(chargeRequest);


        return "redirect:/update-order";
    }

    @ExceptionHandler(StripeException.class)
    public String handleError(Model model, StripeException ex) {
        model.addAttribute("error", ex.getMessage());
        return "checkout-result";
    }

}