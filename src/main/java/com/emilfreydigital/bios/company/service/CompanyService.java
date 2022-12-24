package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.converter.CompanyConverter;
import com.emilfreydigital.bios.company.dto.CompanyDto;
import com.emilfreydigital.bios.company.model.Company;
import com.emilfreydigital.bios.company.repository.CompanyRepository;
import com.emilfreydigital.bios.exception.ApiRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    private Logger logger = LoggerFactory.getLogger(CompanyService.class);
    private final CompanyRepository companyRepository;
    private final CompanyConverter companyConverter;

    @Autowired
    public CompanyService(CompanyRepository companyRepository, CompanyConverter companyConverter) {
        this.companyRepository = companyRepository;
        this.companyConverter = companyConverter;
    }

    public List<CompanyDto> getAll() {

        try {
            logger.info("COMPANY: Fetching companies from database.");
            List<Company> allCompanies = companyRepository.findAll();

            logger.info("COMPANY: Processing companies data.");
            List<CompanyDto> companyDtoList = null;
            if (!(allCompanies == null) && !(allCompanies.isEmpty())) {
                CompanyDto temporaryDto = null;
                for (Company c : allCompanies) {
                    temporaryDto = companyConverter.convertFromEntity(c);
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
            logger.info("COMPANY: Returning list of companies.");
            return companyDtoList;

        } catch (Exception e) {
            logger.info("COMPANY - ERROR - Something went wrong while fetching the list of companies." + e.getStackTrace());
            throw new ApiRequestException("An error occurred while getting the list of companies.",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
