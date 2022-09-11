package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.company.dto.CompanyDto;
import com.emilfreydigital.bios.company.model.Company;
import org.springframework.stereotype.Component;

@Component
public final class CompanyConverter extends Converter<CompanyDto, Company> {
    public CompanyConverter() {
        super(CompanyConverter::convertToEntity, CompanyConverter::convertToDto);
    }

    private static CompanyDto convertToDto(Company model) {
        return new CompanyDto(model.getId(), model.getName());
    }

    private static Company convertToEntity(CompanyDto dto) {
        return new Company(dto.getId(), dto.getName(), null, null);
    }

}
