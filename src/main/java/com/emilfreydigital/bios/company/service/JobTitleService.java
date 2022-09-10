package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.converter.JobTitleConverter;
import com.emilfreydigital.bios.company.dto.JobTitleDto;
import com.emilfreydigital.bios.company.model.JobTitle;
import com.emilfreydigital.bios.company.repository.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobTitleService {


    private final JobTitleRepository jobTitleRepository;

    @Autowired
    public JobTitleService(JobTitleRepository jobTitleRepository) {
        this.jobTitleRepository = jobTitleRepository;
    }

    public List<JobTitleDto> getAll() {
        List<JobTitle> allTitles = jobTitleRepository.findAll();
        List<JobTitleDto> jobTitleDtoListDtoList = null;

        if (!(allTitles == null) && !(allTitles.isEmpty())) {
            JobTitleDto temporaryDto = null;
            for (JobTitle jt : allTitles) {
                temporaryDto = JobTitleConverter.toDto(jt);
                if (jobTitleDtoListDtoList != null) {
                    if (!jobTitleDtoListDtoList.contains(temporaryDto)) {
                        jobTitleDtoListDtoList.add(temporaryDto);
                    }
                } else {
                    jobTitleDtoListDtoList = new ArrayList<>();
                    jobTitleDtoListDtoList.add(temporaryDto);
                }
            }
        }
        return jobTitleDtoListDtoList;
    }


}
