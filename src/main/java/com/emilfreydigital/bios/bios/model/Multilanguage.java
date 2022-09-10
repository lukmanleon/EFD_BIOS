package com.emilfreydigital.bios.bios.model;

import com.sun.istack.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(schema = "bios", name = "multilanguage")
public class Multilanguage {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "translation_key")
    private String translationKey;
    @Nullable
    @Column(name = "eng")
    private String eng;
    @Nullable
    @Column(name = "cro")
    private String cro;
    @Nullable
    @Column(name = "ger")
    private String ger;
    @NotNull
    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @NotNull
    @Column(name = "date_modified")
    private LocalDateTime dateModified;


    public Multilanguage() {
    }

    public Multilanguage(Long id, String translationKey, String eng, String cro, String ger, LocalDateTime dateCreated, LocalDateTime dateModified) {
        id = id;
        this.translationKey = translationKey;
        this.eng = eng;
        this.cro = cro;
        this.ger = ger;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
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
        dateModified = dateModified;
    }
}
