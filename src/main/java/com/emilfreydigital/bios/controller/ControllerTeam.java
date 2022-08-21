package com.emilfreydigital.bios.controller;

import com.emilfreydigital.bios.entity.Team;
import com.emilfreydigital.bios.service.ServiceTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerTeam {

    @Autowired
    ServiceTeam teamService;

    @RequestMapping(value = "/team")
    public List<Team> team() {
        return teamService.getAllTeams();
    }
}
