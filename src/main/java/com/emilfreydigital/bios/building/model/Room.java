package com.emilfreydigital.bios.building.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "building", name = "room")
public class Room {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    @Column(name = "name")
    private String Name;

    @Column(name = "floor_number")
    private Integer FloorNumber;

    @Column(name = "room_number")
    private Integer RoomNumber;

    //TODO Find out why eager fetching works and lazy doesn't

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "room_type_id")
    @Nullable
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private RoomType roomType;
    @NotNull
    @Column(name = "date_created")
    private LocalDateTime DateCreated;
    @NotNull
    @Column(name = "date_modified")
    private LocalDateTime DateModified;

    public Room() {
    }

    public Room(Long id, String name, Integer floorNumber, Integer roomNumber, RoomType roomType, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
        Name = name;
        FloorNumber = floorNumber;
        RoomNumber = roomNumber;
        this.roomType = roomType;
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

    public Integer getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        FloorNumber = floorNumber;
    }

    public Integer getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        RoomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
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
