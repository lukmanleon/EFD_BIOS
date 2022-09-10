package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.model.TeamEmployee;
import com.emilfreydigital.bios.company.service.TeamEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/teamemployee")
public class TeamEmployeeController {
    private final TeamEmployeeService teamEmployeeService;

    @Autowired
    public TeamEmployeeController(TeamEmployeeService teamEmployeeService) {
        this.teamEmployeeService = teamEmployeeService;
    }

    @GetMapping
    public List<TeamEmployee> company() {
        return teamEmployeeService.getAll();
    }

}
