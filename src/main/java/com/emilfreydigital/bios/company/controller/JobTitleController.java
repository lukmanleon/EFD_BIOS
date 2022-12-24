package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.JobTitleDto;
import com.emilfreydigital.bios.company.service.JobTitleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/jobtitle")
public class JobTitleController {
    private Logger logger = LoggerFactory.getLogger(JobTitleController.class);

    private final JobTitleService jobTitleService;

    @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping
    public List<JobTitleDto> company() {
        logger.info("JOB TITLE: Received request for fetching all job titles.");
        return jobTitleService.getAll();
    }

}
