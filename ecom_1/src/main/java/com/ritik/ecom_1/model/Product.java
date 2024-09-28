package com.ritik.ecom_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    @Id
    private int id;
    private String name;
    private String desc;
    private String brand;
    private int price;
    private String category;
    private String releaseDate;
    private boolean available;
    private int quantity;

//    public Product(int id, String name, String sentence, String named, int price, String department, String string, boolean bool, int i) {
//        this.id=id;
//        this.name=name;
//        this.price=price;
//    }

}
