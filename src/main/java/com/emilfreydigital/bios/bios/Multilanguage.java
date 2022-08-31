package com.emilfreydigital.bios.bios;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "bios", name = "multilanguage")
public class Multilanguage {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "translation_key")
    private String TranslationKey;

    @Column(name = "eng")
    private String Eng;

    @Column(name = "cro")
    private String Cro;

    @Column(name = "ger")
    private String Ger;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;

    @Column(name = "date_modified")
    private LocalDateTime DateModified;


    public Multilanguage() {
    }

    public Multilanguage(Long id, String translationKey, String eng, String cro, String ger, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
        TranslationKey = translationKey;
        Eng = eng;
        Cro = cro;
        Ger = ger;
        DateCreated = dateCreated;
        DateModified = dateModified;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTranslationKey() {
        return TranslationKey;
    }

    public void setTranslationKey(String translationKey) {
        TranslationKey = translationKey;
    }

    public String getEng() {
        return Eng;
    }

    public void setEng(String eng) {
        Eng = eng;
    }

    public String getCro() {
        return Cro;
    }

    public void setCro(String cro) {
        Cro = cro;
    }

    public String getGer() {
        return Ger;
    }

    public void setGer(String ger) {
        Ger = ger;
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
