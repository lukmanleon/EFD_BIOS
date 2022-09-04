package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.company.dto.JobTitleDto;
import com.emilfreydigital.bios.company.model.JobTitle;

public final class JobTitleConverter {

    public static JobTitleDto toDto(JobTitle model) {
        JobTitleDto dto = new JobTitleDto();
        dto.setId(model.getId());
        dto.setJobTitleCode(model.getJobTitleCode());
        dto.setDescription(model.getDescription());

        return dto;
    }

    public static JobTitle toModel(JobTitleDto dto) {
        JobTitle model = new JobTitle();
        model.setId(dto.getId());
        model.setJobTitleCode(dto.getJobTitleCode());
        model.setDescription(dto.getDescription());

        return model;
    }
}
