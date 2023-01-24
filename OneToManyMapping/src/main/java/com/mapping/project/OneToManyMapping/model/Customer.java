package com.mapping.project.OneToManyMapping.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String gender;
    private String gmail;
    @OneToMany(targetEntity = Product.class,cascade=CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<Product> products;
}
