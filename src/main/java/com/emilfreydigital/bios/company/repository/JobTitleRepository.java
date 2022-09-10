package com.emilfreydigital.bios.company.repository;

import com.emilfreydigital.bios.company.model.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Long> {

}
