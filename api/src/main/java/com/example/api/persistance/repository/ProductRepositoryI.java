package com.example.api.persistance.repository;

// para el JpaRepository
import org.springframework.data.jpa.repository.JpaRepository;

// es para importar con el nombre de mi archivo los modelos y poder utilizar User ...
import com.example.api.persistance.models.Product;
//                 --------

// para el @Repository
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryI extends JpaRepository<Product, Long>{
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

    Product findByProductName(String productName);
    Product findByProductPrice(Double productPrice);
    Product findByProductNameAndProductPrice(String productName, Float productPrice);
}