package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.company.dto.EmployeeDetailsDto;
import com.emilfreydigital.bios.company.dto.EmployeeDto;
import com.emilfreydigital.bios.company.model.Employee;

public final class EmployeeConverter {

    public static EmployeeDto toDto(Employee model) {
        EmployeeDto dto = new EmployeeDto();
        dto.setId(model.getId());
        dto.setName(model.getName());
        dto.setSurname(model.getSurname());
        dto.setImageUrl(model.getImageUrl());
        dto.setExternal(model.getExternal());
        dto.setJobTitleId(model.getJobTitleId());
        dto.setCompanyId(model.getCompanyId());

        return dto;
    }

    public static EmployeeDetailsDto toDetailedDto(Employee model) {
        EmployeeDetailsDto dto = new EmployeeDetailsDto();
        dto.setId(model.getId());
        dto.setName(model.getName());
        dto.setSurname(model.getSurname());
        dto.setBirthday(model.getBirthday());
        dto.setGender(model.getGender());
        dto.setEmail(model.getEmail());
        dto.setPhone(model.getPhone());
        dto.setImageUrl(model.getImageUrl());
        dto.setExternal(model.getExternal());
        dto.setJobTitleId(model.getJobTitleId());
        dto.setCompanyId(model.getCompanyId());

        return dto;
    }

    public static Employee toModel(EmployeeDto dto) {
        Employee model = new Employee();
        model.setId(dto.getId());
        model.setName(dto.getName());
        model.setSurname(dto.getSurname());
        model.setImageUrl(dto.getImageUrl());
        model.setExternal(dto.getExternal());
        model.setJobTitleId(dto.getJobTitleId());
        model.setCompanyId(dto.getCompanyId());

        return model;
    }
}
