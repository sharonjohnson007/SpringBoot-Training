package com.mapping.project.OneToManyMapping.controller;

import com.mapping.project.OneToManyMapping.model.Customer;
import com.mapping.project.OneToManyMapping.repository.CustomerRepository;
import com.mapping.project.OneToManyMapping.repository.ProductRepository;
import com.mapping.project.OneToManyMapping.request.CustomerRequest;
import com.mapping.project.OneToManyMapping.request.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrder(){
        return customerRepository.findAll();
    }
    @GetMapping("/getOrderInfo")
   public List<OrderResponse> getOrderInfo(){
       return customerRepository.getOrderDetails();
   }
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody CustomerRequest request){
        return customerRepository.save(request.getCustomer());
    }
}
