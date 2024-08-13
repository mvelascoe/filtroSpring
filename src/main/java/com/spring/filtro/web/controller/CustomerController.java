package com.spring.filtro.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.filtro.domain.service.customer.ICustomer;
import com.spring.filtro.percistency.entity.Customer;

//import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private ICustomer service;

    @GetMapping
    public List<Customer> listCustomers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> view(@PathVariable Long id) {
        Optional<Customer> getCustomer = service.findById(id);
        if (getCustomer.isPresent()) {
            return ResponseEntity.ok(getCustomer.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        Customer data = service.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(data);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer customer) {
        Optional<Customer> data = service.update(id, customer);
        if (data.isPresent()) {
            return ResponseEntity.status(HttpStatus.CREATED).body(data.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> delete(@PathVariable Long id) {
        Optional<Customer> customer = service.delete(id);
        if (customer.isPresent()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.notFound().build();
    }
}



