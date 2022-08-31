package com.emilfreydigital.bios.building;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "building", name = "room")
public class Room {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "floor_number")
    private Integer FloorNumber;

    @Column(name = "room_number")
    private Integer RoomNumber;

    //TODO Room - add relationship for HQL and check if anything else is needed
    @Column(name = "room_type")
    private Integer RoomType;

    @Column(name = "date_created")
    private LocalDateTime DateCreated;

    @Column(name = "date_modified")
    private LocalDateTime DateModified;

    public Room() {
    }

    public Room(Long id, String name, Integer floorNumber, Integer roomNumber, Integer roomType, LocalDateTime dateCreated, LocalDateTime dateModified) {
        Id = id;
        Name = name;
        FloorNumber = floorNumber;
        RoomNumber = roomNumber;
        RoomType = roomType;
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

    public Integer getRoomType() {
        return RoomType;
    }

    public void setRoomType(Integer roomType) {
        RoomType = roomType;
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
