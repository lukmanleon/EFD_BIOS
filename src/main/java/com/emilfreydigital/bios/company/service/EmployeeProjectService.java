package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.model.EmployeeProject;
import com.emilfreydigital.bios.company.repository.EmployeeProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeProjectService {
    private Logger logger = LoggerFactory.getLogger(EmployeeProjectService.class);
    private final EmployeeProjectRepository employeeProjectRepository;

    @Autowired
    public EmployeeProjectService(EmployeeProjectRepository employeeProjectRepository) {
        this.employeeProjectRepository = employeeProjectRepository;
    }

    public List<EmployeeProject> getAll() {
        return (List<EmployeeProject>) employeeProjectRepository.findAll();
    }


}
