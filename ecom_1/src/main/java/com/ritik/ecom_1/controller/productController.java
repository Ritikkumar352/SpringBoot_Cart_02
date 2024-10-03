package com.ritik.ecom_1.controller;

import com.ritik.ecom_1.model.Product;
import com.ritik.ecom_1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@CrossOrigin   // to share to differnet port
@RequestMapping("/api")
public class productController {
    @Autowired
    private ProductService service;


    @RequestMapping("/")
    public String home() {
        return "welcome to my Ecom";
    }


    //Redirect
    @GetMapping("/product")
    public RedirectView redirectToProducts() {
        return new RedirectView("/api/products");
    }


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {

        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }


    //Redirect
    @GetMapping("/product/{id}")
    public RedirectView redirectProductById(@PathVariable int id) {
        return new RedirectView("/api/products/" + id);
    }


    //    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product product = service.getProductById(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product,
                                        @RequestPart MultipartFile imageFile) {

        try {
            System.out.println(product);
            Product product1 = service.addProduct(product, imageFile);
            return new ResponseEntity<>(product1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}


//
//public Product getProduct(@PathVariable int id){
//    return service.getProductById(id);
//}