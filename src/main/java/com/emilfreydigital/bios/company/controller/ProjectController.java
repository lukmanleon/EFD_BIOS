package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.ProjectDto;
import com.emilfreydigital.bios.company.model.Project;
import com.emilfreydigital.bios.company.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/project")
public class ProjectController {
    private Logger logger = LoggerFactory.getLogger(ProjectController.class);
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<ProjectDto> allProjects() {
        logger.info("PROJECT: Received request for fetching all projects.");
        return projectService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Project projectById(@PathVariable(value = "id") Long id) {
        logger.info("PROJECT: Received request for fetching a project by ID.");
        return projectService.getProjectById(id);
    }

}
