package com.emilfreydigital.bios.company.repository;

import com.emilfreydigital.bios.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
