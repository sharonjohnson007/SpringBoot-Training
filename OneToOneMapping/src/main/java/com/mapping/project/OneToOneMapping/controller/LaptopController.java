package com.mapping.project.OneToOneMapping.controller;

import com.mapping.project.OneToOneMapping.model.Brand;
import com.mapping.project.OneToOneMapping.model.Laptop;
import com.mapping.project.OneToOneMapping.repository.BrandRepository;
import com.mapping.project.OneToOneMapping.repository.LaptopRepository;
import com.mapping.project.OneToOneMapping.request.LaptopRequest;
import com.mapping.project.OneToOneMapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;
    @Autowired
    private BrandRepository bRepo;
    @Autowired
    private LaptopRepository lRepo;

    @GetMapping("/laptops")
    public List<Laptop> list() {
        return laptopService.listAllLaptop();
    }

    @GetMapping("/laptop/{id}")
    public Laptop get(@PathVariable Long id) {
        return laptopService.getLapById(id);
    }

    @PostMapping("/addLaptop")
    public void add(@RequestBody LaptopRequest lapRequest) {
        Brand brand = new Brand();
        brand.setBrandName(lapRequest.getBrand());
        brand.setProcessor(lapRequest.getProcessor());
        bRepo.save(brand);
        Laptop laptop = new Laptop(lapRequest);
        laptop.setBrand(brand);
        lRepo.save(laptop);
    }

    @PutMapping("/laptop/{id}")
    public void update(@RequestBody Laptop upLap, @PathVariable Long id) {
        laptopService.updateEmployee(upLap);

    }

    @DeleteMapping("/laptop/{id}")
    public void delete(@PathVariable Long id) {
        laptopService.deleteLaptop(id);
    }
}
