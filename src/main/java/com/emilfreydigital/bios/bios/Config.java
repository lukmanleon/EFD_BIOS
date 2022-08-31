package com.emilfreydigital.bios.bios;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "bios", name = "config")
public class Config {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "property_code")
    private String PropertyCode;

    @Column(name = "property_value")
    private String PropertyValue;

    @Column(name = "description")
    private String Description;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;

    @Column(name = "date_modified")
    private LocalDateTime DateModified;


    public Config() {
    }

    public Config(Long id, String propertyCode, String propertyValue, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
        PropertyCode = propertyCode;
        PropertyValue = propertyValue;
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

    public String getPropertyCode() {
        return PropertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        PropertyCode = propertyCode;
    }

    public String getPropertyValue() {
        return PropertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        PropertyValue = propertyValue;
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
