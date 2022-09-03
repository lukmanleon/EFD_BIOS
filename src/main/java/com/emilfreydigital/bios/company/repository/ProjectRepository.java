package com.emilfreydigital.bios.company.repository;

import com.emilfreydigital.bios.company.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
