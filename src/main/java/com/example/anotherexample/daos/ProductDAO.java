package com.example.anotherexample.daos;

import com.example.anotherexample.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Integer> {

    public Product getProductByName(String name);

}
