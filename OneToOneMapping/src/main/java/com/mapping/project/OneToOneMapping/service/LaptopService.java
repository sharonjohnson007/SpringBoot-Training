package com.mapping.project.OneToOneMapping.service;

import com.mapping.project.OneToOneMapping.model.Laptop;
import com.mapping.project.OneToOneMapping.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    public List<Laptop> listAllLaptop() {
        return laptopRepository.findAll();
    }

    public Laptop getLapById(Long id) {
        return laptopRepository.findById(id).get();
    }

    public Laptop saveLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public void deleteLaptop(Long id) {
        laptopRepository.deleteById(id);
    }

    public Laptop updateEmployee(Laptop addLaptop) {
        laptopRepository.save(addLaptop);
        return addLaptop;
    }
}
