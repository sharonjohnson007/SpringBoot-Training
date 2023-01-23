package com.mapping.project.OneToOneMapping.model;

import com.mapping.project.OneToOneMapping.request.LaptopRequest;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private BigDecimal price;
    @OneToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;


    public Laptop() {
    }

    public Laptop(LaptopRequest request) {
        this.name = request.getName();
        this.price = request.getPrice();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand=" + brand +
                '}';
    }
}
