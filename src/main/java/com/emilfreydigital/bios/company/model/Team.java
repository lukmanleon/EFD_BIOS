package com.emilfreydigital.bios.company.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "company", name = "team")
public class Team {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "code")
    @NotNull
    private String Code;
    @NotNull
    @Column(name = "name")
    private String Name;
    @Column(name = "description")
    private String Description;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;
    @Column(name = "date_modified")
    private LocalDateTime DateModified;


    public Team() {
    }

    public Team(Long id, String code, String name, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
        Code = code;
        Name = name;
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

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
