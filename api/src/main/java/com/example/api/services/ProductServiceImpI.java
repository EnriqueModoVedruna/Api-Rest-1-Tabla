package com.example.api.services;

// para utilizar list
import java.util.List;

// par autilizar @Autowired
import org.springframework.beans.factory.annotation.Autowired;

// para utilizar @Service
import org.springframework.stereotype.Service;

import com.example.api.persistance.models.Product;
import com.example.api.persistance.repository.ProductRepositoryI;

@Service
public class ProductServiceImpI implements ProductServiceI{
    
    @Autowired
    ProductRepositoryI productRepo;

    @Override
    public List<Product> showAllProducts(){
        return productRepo.findAll();
    }

    @Override
    public Product showProductByProductName(String productName){
        return productRepo.findByProductName(productName);
    }

    @Override
    public Product showProductByProductPrice(Double productPrice){
        return productRepo.findByProductPrice(productPrice);
    }

    @Override
    public Product showProductByProductNameAndProductPrice(String productName, Float productPrice){
        return productRepo.findByProductNameAndProductPrice(productName, productPrice);
    }

    @Override
    public void saveProduct(Product products){
        productRepo.save(products);
    }

    @Override
    public void updateProduct(Long id, Product products){
        productRepo.save(products);
    }

    @Override
    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }
    

    /*
    los nombres para implementar servicios seran creados en servicios, y aqui para implementar esos servicios
    */
}