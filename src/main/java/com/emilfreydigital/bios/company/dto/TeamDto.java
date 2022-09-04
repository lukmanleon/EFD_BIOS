package com.emilfreydigital.bios.company.dto;


public class TeamDto {


    private Long Id;
    private String Code;

    private String Name;
    private String Description;


    public TeamDto() {
    }

    public TeamDto(Long id, String code, String name, String description) {
        Id = id;
        Code = code;
        Name = name;
        Description = description;
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
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
