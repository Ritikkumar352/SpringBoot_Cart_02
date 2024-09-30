package com.ritik.ecom_1.controller;

import com.ritik.ecom_1.model.Product;
import com.ritik.ecom_1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin   // to share to differnet port
@RequestMapping("/api")
public class productController {
    @Autowired
    private ProductService service;


    @RequestMapping("/")
    public String home(){
        return "welcome to my Ecom";
    }

    @GetMapping ("/product")
    public ResponseEntity<List<Product>> getAllProducts(){

        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

//    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product product=service.getProductById(id);
        if(product!=null) {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}


//
//public Product getProduct(@PathVariable int id){
//    return service.getProductById(id);
//}