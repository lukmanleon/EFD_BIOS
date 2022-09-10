package com.emilfreydigital.bios.bios.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.time.LocalDateTime;

@Entity
@Table(schema = "bios", name = "config")
public class Config {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "property_code")
    private String propertyCode;
    @Null
    @Column(name = "property_value")
    private String propertyValue;
    @Null
    @Column(name = "description")
    private String description;
    @NotNull
    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @NotNull
    @Column(name = "date_modified")
    private LocalDateTime dateModified;


    public Config() {
    }

    public Config(Long id, String propertyCode, String propertyValue, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.propertyCode = propertyCode;
        this.propertyValue = propertyValue;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
