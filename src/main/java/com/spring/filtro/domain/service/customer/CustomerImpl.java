package com.spring.filtro.domain.service.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.filtro.domain.repository.CustomerRepository;
import com.spring.filtro.percistency.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerImpl implements ICustomer{
    @Autowired
    private CustomerRepository repository;

    @Transactional
    @Override
    public List<Customer> findAll() {
        return(List<Customer>) repository.findAll();
    }

    @Transactional
    @Override
    public Optional<Customer> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Customer save(Customer customer) {
       return repository.save(customer);
    }

    @Transactional
    @Override
    public Optional<Customer> update(Long id, Customer customer) {
        Optional<Customer> getCustomer = repository.findById(id);
        if (getCustomer.isPresent()) {
            Customer newCustomer = getCustomer.orElseThrow();
            newCustomer.setName(customer.getName());
            newCustomer.setLastname(customer.getLastname());
            newCustomer.setCity(customer.getCity());
            newCustomer.setEmail(customer.getEmail());
            newCustomer.setBirthdate(customer.getBirthdate());
            newCustomer.setIon(customer.getIon());
            newCustomer.setLatitud(customer.getLatitud());
            return Optional.of(repository.save(newCustomer));
        }
        return getCustomer;
    }
    
    @Transactional
    @Override
    public Optional<Customer> delete(Long id) {
        Optional<Customer> getCustomer = repository.findById(id);
        getCustomer.ifPresent(repository::delete);
        return getCustomer;
    }
}    
