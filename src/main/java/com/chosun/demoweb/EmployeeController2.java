package com.chosun.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController2 {

    private final EmployeeRepository repository;

    public EmployeeController2(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employee")
    List<Employee> all(){
        return repository.findAll();
    }
}
