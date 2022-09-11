package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.company.dto.ProjectDto;
import com.emilfreydigital.bios.company.model.Project;
import org.springframework.stereotype.Component;

@Component
public final class ProjectConverter extends Converter<ProjectDto, Project> {
    public ProjectConverter() {
        super(ProjectConverter::convertToEntity, ProjectConverter::convertToDto);
    }

    private static ProjectDto convertToDto(Project model) {
        return new ProjectDto(model.getId(), model.getName(), model.getDescription());
    }

    private static Project convertToEntity(ProjectDto dto) {
        return new Project(dto.getId(), dto.getName(), dto.getDescription(), null, null);
    }

}
