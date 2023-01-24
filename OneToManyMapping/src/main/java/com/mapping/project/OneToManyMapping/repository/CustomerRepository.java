package com.mapping.project.OneToManyMapping.repository;

import com.mapping.project.OneToManyMapping.model.Customer;
import com.mapping.project.OneToManyMapping.request.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
   @Query(value = "Select new com.mapping.project.OneToManyMapping.request.OrderResponse(c.name,p.productName) FROM Customer c JOIN c.products p")
   public List<OrderResponse> getOrderDetails();
}
