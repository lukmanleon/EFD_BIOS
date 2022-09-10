package com.emilfreydigital.bios.company.repository;

import com.emilfreydigital.bios.company.model.EmployeeProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject, Long> {

}
