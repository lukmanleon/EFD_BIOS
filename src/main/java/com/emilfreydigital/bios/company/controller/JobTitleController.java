package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.model.JobTitle;
import com.emilfreydigital.bios.company.service.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/jobtitle")
public class JobTitleController {

    @Autowired
    JobTitleService jobTitleService;

    @GetMapping
    public List<JobTitle> company() {
        return jobTitleService.getAll();
    }


}
