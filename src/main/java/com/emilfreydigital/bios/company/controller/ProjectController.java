package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.ProjectDto;
import com.emilfreydigital.bios.company.model.Project;
import com.emilfreydigital.bios.company.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/project")
public class ProjectController {
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<ProjectDto> allProjects() {
        return projectService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Project projectById(@PathVariable(value = "id") Long id) {
        return projectService.getProjectById(id);
    }

}
