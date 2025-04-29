package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.model.Customer;

@RestController
public class CustomerController {

  private final CustomerRepository repo;

  CustomerController(CustomerRepository repo) {
    this.repo = repo;
  }

  @GetMapping("/api/customers")
  List<Customer> getAll() {
    return repo.findAll();
  }
}