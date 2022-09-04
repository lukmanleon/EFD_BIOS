package com.emilfreydigital.bios.company.dto;


public class CompanyDto {


    private Long Id;

    private String Name;


    public CompanyDto() {
    }

    public CompanyDto(Long id, String name) {
        Id = id;
        Name = name;
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

}
