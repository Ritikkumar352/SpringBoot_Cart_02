package com.ritik.ecom_1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;


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
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy") ??
    private String releaseDate;
    private boolean available;
    private int quantity;


}
