package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.model.EmployeeProject;
import com.emilfreydigital.bios.company.service.EmployeeProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/employeeproject")
public class EmployeeProjectController {
    private Logger logger = LoggerFactory.getLogger(EmployeeProjectController.class);
    private final EmployeeProjectService employeeProjectService;

    @Autowired
    public EmployeeProjectController(EmployeeProjectService employeeProjectService) {
        this.employeeProjectService = employeeProjectService;
    }

    @GetMapping
    public List<EmployeeProject> company() {
        logger.info("EMPLOYEE PROJECTS: Received request for fetching all employee projects.");
        return employeeProjectService.getAll();
    }

}
