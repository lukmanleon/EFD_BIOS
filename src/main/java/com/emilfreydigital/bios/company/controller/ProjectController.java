package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.model.Project;
import com.emilfreydigital.bios.company.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping
    public List<Project> company() {
        return projectService.getAll();
    }


}
