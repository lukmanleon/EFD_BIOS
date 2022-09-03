package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.model.Project;
import com.emilfreydigital.bios.company.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAll() {
        return (List<Project>) projectRepository.findAll();
    }


}
