package com.spring.filtro.domain.service.customer;

import java.util.List;
import java.util.Optional;

import com.spring.filtro.percistency.entity.Customer;

public interface ICustomer {
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    Optional<Customer> update(Long id, Customer customer);
    Optional<Customer> delete(Long id);
}





