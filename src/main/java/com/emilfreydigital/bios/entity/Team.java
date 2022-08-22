package com.emilfreydigital.bios.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(schema = "company", name = "team")
public class Team {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "code")
    @NotNull
    String Code;

    @Column(name = "description")
    String Description;

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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
