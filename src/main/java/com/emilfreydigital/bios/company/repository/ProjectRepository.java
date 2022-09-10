package com.emilfreydigital.bios.company.repository;

import com.emilfreydigital.bios.company.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
