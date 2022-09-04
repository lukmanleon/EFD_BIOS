package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.company.dto.ProjectDto;
import com.emilfreydigital.bios.company.model.Project;

public final class ProjectConverter {

    public static ProjectDto toDto(Project model) {
        ProjectDto dto = new ProjectDto();
        dto.setId(model.getId());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());

        return dto;
    }

    public static Project toModel(ProjectDto dto) {
        Project model = new Project();
        model.setId(dto.getId());
        model.setName(dto.getName());
        model.setDescription(dto.getDescription());

        return model;
    }
}
