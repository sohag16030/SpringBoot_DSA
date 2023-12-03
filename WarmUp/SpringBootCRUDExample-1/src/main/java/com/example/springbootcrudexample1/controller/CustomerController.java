package com.example.springbootcrudexample1.controller;

import com.example.springbootcrudexample1.entity.Customer;
import com.example.springbootcrudexample1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer Customer) {
        return service.saveCustomer(Customer);
    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomerList(@RequestBody List<Customer> Customers) {
        return service.saveCustomers(Customers);
    }

    @GetMapping("/customer/{id}")
    public Customer findCustomerById(@PathVariable int id) {
        Customer customer = service.findCustomerById(id);
        return service.findCustomerById(id);
    }

    @GetMapping("/Customer/byName/{name}")
    public Customer findCustomerByName(@PathVariable String name) {
        return service.findCustomerByName(name);
    }

    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer Customer) {
        return service.updateCustomer(Customer);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return service.deleteCustomer(id);
    }
}
