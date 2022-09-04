package com.emilfreydigital.bios.company.dto;


public class ProjectDto {

    private Long Id;
    private String Name;
    private String Description;


    public ProjectDto() {
    }

    public ProjectDto(Long id, String name, String description) {
        Id = id;
        Name = name;
        Description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
