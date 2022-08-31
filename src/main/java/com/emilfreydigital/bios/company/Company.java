package com.emilfreydigital.bios.company;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "company", name = "company")
public class Company {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    @NotNull
    private String Name;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;

    @Column(name = "date_modified")
    private LocalDateTime DateModified;

    public Company() {
    }

    public Company(Long id, String name, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
        Name = name;
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
