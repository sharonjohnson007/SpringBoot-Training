package com.mapping.project.OneToOneMapping.repository;

import com.mapping.project.OneToOneMapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository <Laptop,Long>{

}
