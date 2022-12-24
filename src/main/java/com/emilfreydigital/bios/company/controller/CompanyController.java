package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.CompanyDto;
import com.emilfreydigital.bios.company.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/company")
public class CompanyController {

    private Logger logger = LoggerFactory.getLogger(CompanyController.class);
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<CompanyDto> company() {
        logger.info("COMPANY: Received request for fetching all companies.");
        return companyService.getAll();
    }

}
