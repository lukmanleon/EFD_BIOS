package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.model.TeamEmployee;
import com.emilfreydigital.bios.company.service.TeamEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/teamemployee")
public class TeamEmployeeController {

    private Logger logger = LoggerFactory.getLogger(TeamEmployeeController.class);
    private final TeamEmployeeService teamEmployeeService;

    @Autowired
    public TeamEmployeeController(TeamEmployeeService teamEmployeeService) {
        this.teamEmployeeService = teamEmployeeService;
    }

    @GetMapping
    public List<TeamEmployee> company() {
        logger.info("TEAM EMPLOYEES: Received request for fetching all teams and their employees.");
        return teamEmployeeService.getAll();
    }

}
