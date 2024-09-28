package com.ritik.ecom_1.service;

import com.ritik.ecom_1.model.Product;
import org.springframework.stereotype.Service;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

//    private Faker faker=new Faker();

    public List<Product> getAllProducts() {

        List<Product> products = new ArrayList<>();





//        for(int i=0;i<10;i++){
//            Product product = new Product(
//                    i, // id
//                    faker.commerce().productName(), // Generates random product name
//                    faker.lorem().sentence(10), // Generates a random description
//                    faker.company().name(), // Generates a random brand
//                    faker.number().numberBetween(100, 1000), // Generates random price between 100 and 1000
//                    faker.commerce().department(), // Generates a random category
//                    faker.date().past(365, java.util.concurrent.TimeUnit.DAYS).toString(), // Generates a random release date
//                    faker.bool().bool(), // Generates a random availability status
//                    faker.number().numberBetween(1, 100) // Generates random quantity between 1 and 100
//            );
//            products.add(product);
//        }

        // no constructor for this in product class


        return products;
    }


}












//
//// Create and add some sample products to the list (for demonstration)
//Product product1 = new Product(1, "Product 1", 100); // Example product with id, name, price
//Product product2 = new Product(2, "Product 2", 200);
//
//        products.add(product1);
//        products.add(product2);