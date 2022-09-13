package com.emilfreydigital.bios.building.model;

import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "building", name = "room")
public class Room {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "floor_number")
    private Integer floorNumber;

    @Column(name = "room_number")
    private Integer roomNumber;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "room_type_id")
    @Nullable
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private RoomType roomType;

    @NotNull
    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @NotNull
    @Column(name = "date_modified")
    private LocalDateTime dateModified;

    public Room() {
    }

    public Room(Long id, String name, Integer floorNumber, Integer roomNumber, @Nullable RoomType roomType, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.name = name;
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Nullable
    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(@Nullable RoomType roomType) {
        this.roomType = roomType;
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
