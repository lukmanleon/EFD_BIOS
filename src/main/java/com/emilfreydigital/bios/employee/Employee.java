package com.emilfreydigital.bios.employee;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "company", name = "employee")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "surname")
    private String Surname;

    @Column(name = "birthday")
    private LocalDateTime Birthday;

    @Column(name = "gender")
    private Boolean Gender;

    @Column(name = "email")
    private String Email;

    @Column(name = "phone_number")
    private String Phone;

    @Column(name = "image_url")
    private String ImageUrl;

    @Column(name = "is_external")
    private Boolean IsExternal;

    //TODO Employee - add relationship for HQL and check if anything else is needed
    @Column(name = "job_title_id")
    private Integer JobTitleId;

    @Column(name = "office_room_id")
    private Integer OfficeRoomID;

    @Column(name = "company_id")
    private Integer CompanyId;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;

    @Column(name = "date_modified")
    private LocalDateTime DateModified;

    public Employee() {
    }

    public Employee(Long id, String name, String surname, LocalDateTime birthday, Boolean gender,
                    String email, String phone, String imageUrl, Boolean isExternal,
                    Integer jobTitleId, Integer officeRoomID, Integer companyId,
                    LocalDateTime dateCreated, LocalDateTime dateModified) {
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
        DateCreated = dateCreated;
        DateModified = dateModified;
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

    public LocalDateTime getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        DateCreated = dateCreated;
    }

    public LocalDateTime getDateModified() {
        return DateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        DateModified = dateModified;
    }
}
