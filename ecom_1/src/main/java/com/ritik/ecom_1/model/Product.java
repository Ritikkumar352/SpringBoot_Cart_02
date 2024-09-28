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


}
