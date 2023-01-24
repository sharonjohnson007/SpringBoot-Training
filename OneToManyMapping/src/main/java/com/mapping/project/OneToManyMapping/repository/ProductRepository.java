package com.mapping.project.OneToManyMapping.repository;

import com.mapping.project.OneToManyMapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
