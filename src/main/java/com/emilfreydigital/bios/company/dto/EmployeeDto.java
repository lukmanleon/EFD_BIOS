package com.emilfreydigital.bios.company.dto;

public class EmployeeDto {
    private Long Id;
    private String Name;
    private String Surname;
    private String ImageUrl;
    private Boolean IsExternal;
    private Integer JobTitleId;
    private Integer CompanyId;


    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, String surname, String imageUrl, Boolean isExternal,
                       Integer jobTitleId, Integer companyId) {
        Id = id;
        Name = name;
        Surname = surname;
        ImageUrl = imageUrl;
        IsExternal = isExternal;
        JobTitleId = jobTitleId;
        CompanyId = companyId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public Boolean getExternal() {
        return IsExternal;
    }

    public void setExternal(Boolean external) {
        IsExternal = external;
    }

    public Integer getJobTitleId() {
        return JobTitleId;
    }

    public void setJobTitleId(Integer jobTitleId) {
        JobTitleId = jobTitleId;
    }

    public Integer getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(Integer companyId) {
        CompanyId = companyId;
    }
}
