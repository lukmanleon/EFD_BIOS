package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.model.EmployeeProject;
import com.emilfreydigital.bios.company.repository.EmployeeProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeProjectService {

    @Autowired
    EmployeeProjectRepository employeeProjectRepository;

    public List<EmployeeProject> getAll() {
        return (List<EmployeeProject>) employeeProjectRepository.findAll();
    }


}
