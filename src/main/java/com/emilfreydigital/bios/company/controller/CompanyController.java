package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.CompanyDto;
import com.emilfreydigital.bios.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping
    public List<CompanyDto> company() {
        return companyService.getAll();
    }


}
