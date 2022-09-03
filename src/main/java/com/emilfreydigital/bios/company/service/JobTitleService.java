package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.model.JobTitle;
import com.emilfreydigital.bios.company.repository.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleService {

    @Autowired
    JobTitleRepository jobTitleRepository;

    public List<JobTitle> getAll() {
        return (List<JobTitle>) jobTitleRepository.findAll();
    }


}
