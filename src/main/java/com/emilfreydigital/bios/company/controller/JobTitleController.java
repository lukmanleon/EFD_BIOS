package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.JobTitleDto;
import com.emilfreydigital.bios.company.service.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bios/jobtitle")
public class JobTitleController {
    private final JobTitleService jobTitleService;

    @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping
    public List<JobTitleDto> company() {
        return jobTitleService.getAll();
    }

}
