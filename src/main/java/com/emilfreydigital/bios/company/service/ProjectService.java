package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.converter.ProjectConverter;
import com.emilfreydigital.bios.company.dto.ProjectDto;
import com.emilfreydigital.bios.company.model.Project;
import com.emilfreydigital.bios.company.repository.ProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private Logger logger = LoggerFactory.getLogger(ProjectService.class);
    private final ProjectRepository projectRepository;
    private final ProjectConverter projectConverter;

    @Autowired
    public ProjectService(ProjectRepository projectRepository, ProjectConverter projectConverter) {
        this.projectRepository = projectRepository;
        this.projectConverter = projectConverter;
    }

    public List<ProjectDto> getAll() {
        List<Project> allProjects = projectRepository.findAll();
        List<ProjectDto> projectDtoList = null;

        if (!(allProjects == null) && !(allProjects.isEmpty())) {
            ProjectDto temporaryDto = null;
            for (Project p : allProjects) {
                temporaryDto = projectConverter.convertFromEntity(p);
                if (projectDtoList != null) {
                    if (!projectDtoList.contains(temporaryDto)) {
                        projectDtoList.add(temporaryDto);
                    }
                } else {
                    projectDtoList = new ArrayList<>();
                    projectDtoList.add(temporaryDto);
                }
            }
        }
        return projectDtoList;

    }

    public Project getProjectById(Long Id) {
        Optional<Project> searchedProject = projectRepository.findById(Id);
        if (!searchedProject.isPresent()) {
            throw new EntityNotFoundException();
        }
        return searchedProject.get();
    }

}
