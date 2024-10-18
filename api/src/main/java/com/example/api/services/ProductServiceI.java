package com.example.api.services;

import java.util.List;

// para poder utilizar User
import com.example.api.persistance.models.Product;

public interface ProductServiceI {
    List<Product> showAllProducts();
    Product showProductByProductName(String productName);
    Product showProductByProductPrice(Double productPrice);
    Product showProductByProductNameAndProductPrice(String productName, Float productPrice);
    void saveProduct(Product product);
    void updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
