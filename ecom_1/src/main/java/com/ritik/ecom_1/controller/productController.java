package com.ritik.ecom_1.controller;


import com.ritik.ecom_1.model.Product;
import com.ritik.ecom_1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class productController {
    @Autowired
    private ProductService service;

    @RequestMapping("/product")
    public String list(){
        return "list of product here";
    }

    @RequestMapping("/")
    public String home(){
        return "welcome to my Ecom";
    }

    @GetMapping ("/products")
    public List<Product> getAllProducts(){
         return service.getAllProducts();
    }

}
