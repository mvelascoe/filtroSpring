package com.spring.filtro.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.filtro.percistency.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

    
}
