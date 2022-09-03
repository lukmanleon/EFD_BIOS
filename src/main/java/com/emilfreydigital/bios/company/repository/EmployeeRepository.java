package com.emilfreydigital.bios.company.repository;

import com.emilfreydigital.bios.company.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
