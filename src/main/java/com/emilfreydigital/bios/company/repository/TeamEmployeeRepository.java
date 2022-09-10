package com.emilfreydigital.bios.company.repository;

import com.emilfreydigital.bios.company.model.TeamEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamEmployeeRepository extends JpaRepository<TeamEmployee, Long> {

}
