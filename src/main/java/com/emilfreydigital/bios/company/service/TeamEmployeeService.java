package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.model.TeamEmployee;
import com.emilfreydigital.bios.company.repository.TeamEmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamEmployeeService {
    private Logger logger = LoggerFactory.getLogger(TeamEmployeeService.class);
    private final TeamEmployeeRepository teamEmployeeRepository;

    @Autowired
    public TeamEmployeeService(TeamEmployeeRepository teamEmployeeRepository) {
        this.teamEmployeeRepository = teamEmployeeRepository;
    }

    public List<TeamEmployee> getAll() {
        return (List<TeamEmployee>) teamEmployeeRepository.findAll();
    }


}
