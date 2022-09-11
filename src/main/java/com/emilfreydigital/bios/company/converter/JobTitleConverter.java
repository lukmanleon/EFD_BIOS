package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.company.dto.JobTitleDto;
import com.emilfreydigital.bios.company.model.JobTitle;
import org.springframework.stereotype.Component;

@Component
public final class JobTitleConverter extends Converter<JobTitleDto, JobTitle> {

    public JobTitleConverter() {
        super(JobTitleConverter::convertToEntity, JobTitleConverter::convertToDto);
    }

    private static JobTitleDto convertToDto(JobTitle model) {
        return new JobTitleDto(model.getId(), model.getJobTitleCode(), model.getDescription());
    }

    private static JobTitle convertToEntity(JobTitleDto dto) {
        return new JobTitle(dto.getId(), dto.getJobTitleCode(), dto.getDescription(), null, null);
    }

}
