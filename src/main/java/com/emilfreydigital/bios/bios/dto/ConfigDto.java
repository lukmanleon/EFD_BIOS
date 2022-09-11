package com.emilfreydigital.bios.bios.dto;

public class ConfigDto {

    private Long id;
    private String propertyCode;
    private String propertyValue;
    private String description;

    public ConfigDto() {
    }

    public ConfigDto(Long id, String propertyCode, String propertyValue, String description) {
        this.id = id;
        this.propertyCode = propertyCode;
        this.propertyValue = propertyValue;
        this.description = description;
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

}
