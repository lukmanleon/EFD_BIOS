package com.emilfreydigital.bios.company.dto;

import java.time.LocalDateTime;

public class EmployeeDetailsDto {
    private Long Id;
    private String Name;
    private String Surname;
    private LocalDateTime Birthday;
    private Boolean Gender;
    private String Email;
    private String Phone;
    private String ImageUrl;
    private Boolean IsExternal;
    private Integer JobTitleId;
    private Integer OfficeRoomID;
    private Integer CompanyId;


    public EmployeeDetailsDto() {
    }

    public EmployeeDetailsDto(Long id, String name, String surname, LocalDateTime birthday, Boolean gender,
                              String email, String phone, String imageUrl, Boolean isExternal,
                              Integer jobTitleId, Integer officeRoomID, Integer companyId) {
        Id = id;
        Name = name;
        Surname = surname;
        Birthday = birthday;
        Gender = gender;
        Email = email;
        Phone = phone;
        ImageUrl = imageUrl;
        IsExternal = isExternal;
        JobTitleId = jobTitleId;
        OfficeRoomID = officeRoomID;
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

    public LocalDateTime getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        Birthday = birthday;
    }

    public Boolean getGender() {
        return Gender;
    }

    public void setGender(Boolean gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
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

    public Integer getOfficeRoomID() {
        return OfficeRoomID;
    }

    public void setOfficeRoomID(Integer officeRoomID) {
        OfficeRoomID = officeRoomID;
    }

    public Integer getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(Integer companyId) {
        CompanyId = companyId;
    }

}
