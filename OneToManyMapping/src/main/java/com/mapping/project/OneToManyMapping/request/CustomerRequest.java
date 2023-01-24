package com.mapping.project.OneToManyMapping.request;

import com.mapping.project.OneToManyMapping.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerRequest {

    private Customer customer;
}
