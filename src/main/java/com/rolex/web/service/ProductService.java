package com.rolex.web.service;

import com.rolex.web.model.Product;
import com.rolex.web.repository.*;
import com.rolex.web.viewmodel.AdminProductVM;
import com.rolex.web.viewmodel.Filter;
import com.rolex.web.viewmodel.ListProductVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<ListProductVM> getProductListWithFilter() {
        List<ListProductVM> listProductVMList = new ArrayList<>();
        List<Product> productList = productRepository.findAll();
        for (Product product :
                productList) {
            ListProductVM pvm = new ListProductVM();
            pvm.setProductID(product.getProductID());
            pvm.setImg(product.getImg());
            pvm.setProductName(product.getProductName());
            pvm.setPrice(product.getPrice());
            pvm.setCollectionName(collectionRepository.findByCollectionID(product.getCollectionID()).getCollectionName());
            pvm.setTypeValue(watchTypeRepository.findByWatchTypeID(product.getWatchTypeID()).getWatchTypeValue());
            pvm.setMaterialValue(materialRepository.findByMaterialID(product.getMaterialID()).getMaterialName());
            pvm.setSizeValue(watchSizeRepository.findBySizeID(product.getSizeID()).getSizeValue());

            listProductVMList.add(pvm);
        }
        return listProductVMList;
    }

    public List<ListProductVM> getProductListWithFilter(Filter filter) {
        List<ListProductVM> productList = this.getProductListWithFilter();
        List<String> collectionFilters = Arrays.asList(filter.getCollectionFilter());
        List<String> typeFilters = Arrays.asList(filter.getTypeFilter());
        List<String> materialFilters = Arrays.asList(filter.getMaterialFilter());
        List<String> sizeFilters = Arrays.asList(filter.getSizeFilter());

        if (collectionFilters.size() > 0) {
            productList = productList.stream()
                    .filter(p -> collectionFilters.contains(p.getCollectionName())).collect(Collectors.toList());
        }
        if (typeFilters.size() > 0) {
            productList = productList.stream()
                    .filter(p -> typeFilters.contains(p.getTypeValue())).collect(Collectors.toList());
        }
        if (materialFilters.size() > 0) {
            productList = productList.stream()
                    .filter(p -> materialFilters.contains(p.getMaterialValue())).collect(Collectors.toList());
        }
        if (sizeFilters.size() > 0) {
            productList = productList.stream()
                    .filter(p -> sizeFilters.contains(Integer.toString(p.getSizeValue()))).collect(Collectors.toList());
        }

        return productList;
    }

    public void addProduct(AdminProductVM productViewModel) {
        Product product = productRepository.findFirstByProductID(productViewModel.getProductID());
        if (product == null) {
            product = new Product();
        }
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
        product.setMaterialID(materialRepository.findByMaterialName(productViewModel.getMaterialName()).getMaterialID());
        productRepository.save(product);
    }

    public void deleteProductByProductID(String productID) {
        productRepository.deleteByProductID(productID);
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

    public List<AdminProductVM> getProductVMList() {
        List<Product> productList = productRepository.findAll();
        List<AdminProductVM> pvmList = new ArrayList<>();

        for (Product item : productList) {
            AdminProductVM pvm = new AdminProductVM();
            pvm.setProductName(item.getProductName());
            pvm.setProductID(item.getProductID());
            pvm.setCollectionName(collectionRepository.findByCollectionID(item.getCollectionID()).getCollectionName());
            pvm.setDescription(item.getDescription());
            pvm.setPrice(item.getPrice());
            pvm.setStock(item.getStock());
            pvm.setImg(item.getImg());
            pvm.setMaterialName(materialRepository.findByMaterialID(item.getMaterialID()).getMaterialName());

            pvm.setSizeValue(watchSizeRepository.findBySizeID(item.getSizeID()).getSizeValue());
            pvm.setWatchTypeValue(watchTypeRepository.findByWatchTypeID(item.getWatchTypeID()).getWatchTypeValue());
            pvm.setImgDetails(item.getImgDetails());

            pvmList.add(pvm);
        }

        return pvmList;
    }
    public Product getProductFromID(String productID) {
        return productRepository.findFirstByProductID(productID);
    }
    public AdminProductVM getProductVMFromID(String productID) {
        Product product = productRepository.findFirstByProductID(productID);
        AdminProductVM pvm = new AdminProductVM();

        pvm.setProductID(product.getProductID());
        pvm.setCollectionName(collectionRepository.findByCollectionID(product.getCollectionID()).getCollectionName());
        pvm.setProductName(product.getProductName());
        pvm.setDescription(product.getDescription());
        pvm.setPrice(product.getPrice());
        pvm.setStock(product.getStock());
        pvm.setImg(product.getImg());
        pvm.setMaterialName(materialRepository.findByMaterialID(product.getMaterialID()).getMaterialName());

        pvm.setSizeValue(watchSizeRepository.findBySizeID(product.getSizeID()).getSizeValue());
        pvm.setWatchTypeValue(watchTypeRepository.findByWatchTypeID(product.getWatchTypeID()).getWatchTypeValue());
        pvm.setImgDetails(product.getImgDetails());
        pvm.setDetailDescription(product.getDetailDescription());

        return pvm;
    }

}
