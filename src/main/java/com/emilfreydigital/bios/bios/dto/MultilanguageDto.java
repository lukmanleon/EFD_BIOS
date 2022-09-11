package com.emilfreydigital.bios.bios.dto;

public class MultilanguageDto {

    private Long id;
    private String translationKey;
    private String eng;
    private String cro;
    private String ger;


    public MultilanguageDto() {
    }

    public MultilanguageDto(Long id, String translationKey, String eng, String cro, String ger) {
        this.id = id;
        this.translationKey = translationKey;
        this.eng = eng;
        this.cro = cro;
        this.ger = ger;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getTranslationKey() {
        return translationKey;
    }

    public void setTranslationKey(String translationKey) {
        this.translationKey = translationKey;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getGer() {
        return ger;
    }

    public void setGer(String ger) {
        this.ger = ger;
    }

}
