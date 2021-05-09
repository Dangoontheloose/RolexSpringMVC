package com.rolex.web.service;

import com.rolex.web.model.Product;
import com.rolex.web.repository.ProductRepository;
import com.rolex.web.viewmodel.ProductViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.insert(product);
    }

    public List<Product> sortProductByCollectionID(int collectionID) {
        return productRepository.findByCollectionID(collectionID);
    }

}
