package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.model.Company;
import com.emilfreydigital.bios.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public List<Company> getAll() {
        return (List<Company>) companyRepository.findAll();
    }


}
