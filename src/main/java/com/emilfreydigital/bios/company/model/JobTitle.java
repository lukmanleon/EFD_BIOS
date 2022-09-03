package com.emilfreydigital.bios.company.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "company", name = "job_title")
public class JobTitle {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    @Column(name = "job_title_code")
    private String JobTitleCode;

    @Nullable
    @Column(name = "description")
    private String Description;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;
    @Column(name = "date_modified")
    private LocalDateTime DateModified;


    public JobTitle() {
    }

    public JobTitle(Long id, String jobTitleCode, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
        JobTitleCode = jobTitleCode;
        Description = description;
        DateCreated = dateCreated;
        DateModified = dateModified;
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
