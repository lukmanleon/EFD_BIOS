package com.emilfreydigital.bios.company.model;

import com.sun.istack.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(schema = "company", name = "employee")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;
    @Nullable
    @Column(name = "birthday")
    private LocalDateTime birthday;
    @Nullable
    @Column(name = "gender")
    private Boolean gender;
    @Nullable
    @Column(name = "email")
    private String email;
    @Nullable
    @Column(name = "phone_number")
    private String phone;
    @Nullable
    @Column(name = "image_url")
    private String imageUrl;
    @Nullable
    @Column(name = "is_external")
    private Boolean isExternal;

    @Nullable
    @Column(name = "job_title_id")
    private Integer jobTitleId;
    @Nullable
    @Column(name = "office_room_id")
    private Integer officeRoomID;
    @Nullable
    @Column(name = "company_id")
    private Integer companyId;
    @NotNull
    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @NotNull
    @Column(name = "date_modified")
    private LocalDateTime dateModified;

    public Employee() {
    }

    public Employee(Long id, String name, String surname, LocalDateTime birthday, Boolean gender,
                    String email, String phone, String imageUrl, Boolean isExternal,
                    Integer jobTitleId, Integer officeRoomID, Integer companyId,
                    LocalDateTime dateCreated, LocalDateTime dateModified) {
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
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
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

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }
}
