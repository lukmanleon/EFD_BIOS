package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.converter.CompanyConverter;
import com.emilfreydigital.bios.company.dto.CompanyDto;
import com.emilfreydigital.bios.company.model.Company;
import com.emilfreydigital.bios.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public List<CompanyDto> getAll() {
        List<Company> allCompanies = companyRepository.findAll();
        List<CompanyDto> companyDtoList = null;

        if (!(allCompanies == null) && !(allCompanies.isEmpty())) {
            CompanyDto temporaryDto = null;
            for (Company c : allCompanies) {
                temporaryDto = CompanyConverter.toDto(c);
                if (companyDtoList != null) {
                    if (!companyDtoList.contains(temporaryDto)) {
                        companyDtoList.add(temporaryDto);
                    }
                } else {
                    companyDtoList = new ArrayList<>();
                    companyDtoList.add(temporaryDto);
                }
            }
        }
        return companyDtoList;
    }


}
