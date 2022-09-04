package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.company.dto.CompanyDto;
import com.emilfreydigital.bios.company.model.Company;

public final class CompanyConverter {

    public static CompanyDto toDto(Company model) {
        CompanyDto dto = new CompanyDto();
        dto.setId(model.getId());
        dto.setName(model.getName());

        return dto;
    }

    public static Company toModel(CompanyDto dto) {
        Company model = new Company();
        model.setId(dto.getId());
        model.setName(dto.getName());

        return model;
    }
}
