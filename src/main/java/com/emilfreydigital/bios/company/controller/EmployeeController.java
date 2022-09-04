package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.EmployeeDetailsDto;
import com.emilfreydigital.bios.company.dto.EmployeeDto;
import com.emilfreydigital.bios.company.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDto> getEmployees() {
        return employeeService.getAll();
    }

    @GetMapping(value = "/table")
    public List<EmployeeDto> getTableEmployees() {
        return employeeService.getAll();
    }

    @GetMapping(value = "/{id}")
    public EmployeeDetailsDto getEmployeeById(@PathVariable(value = "id") Long id) {
        return employeeService.getEmployeeById(id);
    }


}
