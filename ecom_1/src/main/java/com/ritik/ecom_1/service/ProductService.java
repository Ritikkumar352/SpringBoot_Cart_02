package com.ritik.ecom_1.service;

import com.ritik.ecom_1.model.Product;
import com.ritik.ecom_1.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.javafaker.Faker;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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


    public Product getProductById(int id) {
      return repo.findById(id).orElse(null);
//      or use .get()
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());
        return repo.save(product);
    }
}

