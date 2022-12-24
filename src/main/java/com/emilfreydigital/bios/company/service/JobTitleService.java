package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.converter.JobTitleConverter;
import com.emilfreydigital.bios.company.dto.JobTitleDto;
import com.emilfreydigital.bios.company.model.JobTitle;
import com.emilfreydigital.bios.company.repository.JobTitleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobTitleService {
    private Logger logger = LoggerFactory.getLogger(JobTitleService.class);

    private final JobTitleRepository jobTitleRepository;
    private final JobTitleConverter jobTitleConverter;

    @Autowired
    public JobTitleService(JobTitleRepository jobTitleRepository, JobTitleConverter jobTitleConverter) {
        this.jobTitleRepository = jobTitleRepository;
        this.jobTitleConverter = jobTitleConverter;
    }

    public List<JobTitleDto> getAll() {
        List<JobTitle> allTitles = jobTitleRepository.findAll();
        List<JobTitleDto> jobTitleDtoListDtoList = null;

        if (!(allTitles == null) && !(allTitles.isEmpty())) {
            JobTitleDto temporaryDto = null;
            for (JobTitle jt : allTitles) {
                temporaryDto = jobTitleConverter.convertFromEntity(jt);
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
