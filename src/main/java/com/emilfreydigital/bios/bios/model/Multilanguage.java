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
    private Long Id;
    @NotNull
    @Column(name = "translation_key")
    private String TranslationKey;
    @Nullable
    @Column(name = "eng")
    private String Eng;
    @Nullable
    @Column(name = "cro")
    private String Cro;
    @Nullable
    @Column(name = "ger")
    private String Ger;
    @NotNull
    @Column(name = "date_created")
    private LocalDateTime DateCreated;
    @NotNull
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
