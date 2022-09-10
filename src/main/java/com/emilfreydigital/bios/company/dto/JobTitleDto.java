package com.emilfreydigital.bios.company.dto;

public class JobTitleDto {

    private Long id;
    private String jobTitleCode;
    private String description;


    public JobTitleDto() {
    }

    public JobTitleDto(Long id, String jobTitleCode, String description) {
        this.id = id;
        this.jobTitleCode = jobTitleCode;
        this.description = description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitleCode() {
        return jobTitleCode;
    }

    public void setJobTitleCode(String jobTitleCode) {
        this.jobTitleCode = jobTitleCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
