package com.emilfreydigital.bios.building;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(schema = "building", name = "room_type")
public class RoomType {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "description")
    private String Description;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;

    @Column(name = "date_modified")
    private LocalDateTime DateModified;

    public RoomType() {
    }

    public RoomType(Long id, String name, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
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
