package com.emilfreydigital.bios.company.dto;

import java.time.LocalDateTime;

public class EmployeeDetailsDto {
    private Long id;
    private String name;
    private String surname;
    private LocalDateTime birthday;
    private Boolean gender;
    private String email;
    private String phone;
    private String imageUrl;
    private Boolean isExternal;
    private Integer jobTitleId;
    private Integer officeRoomID;
    private Integer companyId;


    public EmployeeDetailsDto() {
    }

    public EmployeeDetailsDto(Long id, String name, String surname, LocalDateTime birthday, Boolean gender,
                              String email, String phone, String imageUrl, Boolean isExternal,
                              Integer jobTitleId, Integer officeRoomID, Integer companyId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.isExternal = isExternal;
        this.jobTitleId = jobTitleId;
        this.officeRoomID = officeRoomID;
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

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Integer getOfficeRoomID() {
        return officeRoomID;
    }

    public void setOfficeRoomID(Integer officeRoomID) {
        this.officeRoomID = officeRoomID;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

}
