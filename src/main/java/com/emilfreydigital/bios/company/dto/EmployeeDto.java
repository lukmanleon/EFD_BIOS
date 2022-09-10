package com.emilfreydigital.bios.company.dto;

public class EmployeeDto {
    private Long id;
    private String name;
    private String surname;
    private String imageUrl;
    private Boolean isExternal;
    private Integer jobTitleId;
    private Integer companyId;


    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, String surname, String imageUrl, Boolean isExternal,
                       Integer jobTitleId, Integer companyId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.imageUrl = imageUrl;
        this.isExternal = isExternal;
        this.jobTitleId = jobTitleId;
        this.companyId = companyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getExternal() {
        return isExternal;
    }

    public void setExternal(Boolean external) {
        isExternal = external;
    }

    public Integer getJobTitleId() {
        return jobTitleId;
    }

    public void setJobTitleId(Integer jobTitleId) {
        this.jobTitleId = jobTitleId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
