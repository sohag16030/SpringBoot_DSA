package com.example.springbootcrudexample1.service;

import com.example.springbootcrudexample1.entity.Customer;
import com.example.springbootcrudexample1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> customers) {
        return repository.saveAll(customers);
    }

    public Customer findCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Customer findCustomerByName(String name) {
        return repository.findByName(name);
    }

    public List<Customer> findAllCustomers() {
        return repository.findAll();
    }

    public String deleteCustomer(int id) {
        repository.deleteById(id);
        return "Customer Deleted ||" + id;
    }

    public Customer updateCustomer(Customer customer) {
        Customer existingCustomer = findCustomerById(customer.getId());
        if (existingCustomer != null) {
            existingCustomer.setName(customer.getName());
            existingCustomer.setAddress(customer.getAddress());

            // Assuming you want to update the associated products as well
            existingCustomer.setProducts(customer.getProducts());

            // Save the updated customer entity
            return repository.save(existingCustomer);
        }
        return null;
    }
}
