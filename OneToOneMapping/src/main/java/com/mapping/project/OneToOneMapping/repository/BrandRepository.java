package com.mapping.project.OneToOneMapping.repository;

import com.mapping.project.OneToOneMapping.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Long> {
}
