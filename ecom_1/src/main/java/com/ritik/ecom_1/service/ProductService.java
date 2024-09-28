package com.ritik.ecom_1.service;

import com.ritik.ecom_1.model.Product;
import com.ritik.ecom_1.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;
//    private Faker faker=new Faker();

    public List<Product> getAllProducts() {

        return repo.findAll();


    }


}

