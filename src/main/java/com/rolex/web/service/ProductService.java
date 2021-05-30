package com.rolex.web.service;

import com.rolex.web.model.Product;
import com.rolex.web.repository.*;
import com.rolex.web.viewmodel.ProductViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CollectionRepository collectionRepository;
    @Autowired
    private WatchSizeRepository watchSizeRepository;
    @Autowired
    private WatchTypeRepository watchTypeRepository;
    @Autowired
    private MaterialRepository materialRepository;

    public List<Product> getProductList() {
        return productRepository.findAll();
    }

    public void addProduct(ProductViewModel productViewModel) {
        Product product = new Product();
        product.setProductID(productViewModel.getProductID());
        product.setDescription(productViewModel.getDescription());
        product.setPrice(productViewModel.getPrice());
        product.setStock(productViewModel.getStock());
        product.setImg(productViewModel.getImg());

        product.setCollectionID(
                collectionRepository.findByCollectionName(productViewModel.getCollectionName()).getCollectionID());
        product.setSizeID(watchSizeRepository.findBySizeValue(productViewModel.getSizeValue()).getSizeID());
        product.setWatchTypeID(
                watchTypeRepository.findByWatchTypeValue(productViewModel.getWatchTypeValue()).getWatchTypeID());

        productRepository.insert(product);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public Product sortProductByCollectionID(int collectionID) {
        return productRepository.findFirstByCollectionID(collectionID);
    }

    public boolean collectionIDNotUsed(int collectionID) {
        return productRepository.findFirstByCollectionID(collectionID) == null;
    }

    public Product findProductID(String productID) {
        return productRepository.findFirstByProductID(productID);
    }

    public List<ProductViewModel> getProductVMList() {
        List<Product> productList = this.getProductList();
        List<ProductViewModel> pvmList = new ArrayList<>();

        for (Product item : productList) {
            ProductViewModel pvm = new ProductViewModel();
            pvm.setProductID(item.getProductID());
            pvm.setCollectionName(collectionRepository.findByCollectionID(item.getCollectionID()).getCollectionName());
            pvm.setDescription(item.getDescription());
            pvm.setPrice(item.getPrice());
            pvm.setStock(item.getStock());
            pvm.setImg(item.getImg());
            pvm.setMaterialValue(materialRepository.findByMaterialID(item.getMaterialID()).getMaterialName());

            pvm.setSizeValue(watchSizeRepository.findBySizeID(item.getSizeID()).getSizeValue());
            pvm.setWatchTypeValue(watchTypeRepository.findByWatchTypeID(item.getWatchTypeID()).getWatchTypeValue());
            pvm.setImgDetails(item.getImgDetails());

            pvmList.add(pvm);
        }

        return pvmList;
    }
}
