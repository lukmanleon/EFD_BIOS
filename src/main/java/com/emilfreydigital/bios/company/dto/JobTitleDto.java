package com.emilfreydigital.bios.company.dto;

public class JobTitleDto {

    private Long Id;
    private String JobTitleCode;
    private String Description;


    public JobTitleDto() {
    }

    public JobTitleDto(Long id, String jobTitleCode, String description) {
        Id = id;
        JobTitleCode = jobTitleCode;
        Description = description;

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getJobTitleCode() {
        return JobTitleCode;
    }

    public void setJobTitleCode(String jobTitleCode) {
        JobTitleCode = jobTitleCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
