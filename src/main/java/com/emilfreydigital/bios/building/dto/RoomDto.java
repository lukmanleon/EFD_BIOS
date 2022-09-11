package com.emilfreydigital.bios.building.dto;

public class RoomDto {

    private Long id;
    private String name;
    private Integer floorNumber;
    private Integer roomNumber;
    private Integer roomTypeId;


    public RoomDto() {
    }

    public RoomDto(Long id, String name, Integer floorNumber, Integer roomNumber, Integer roomTypeId) {
        this.id = id;
        this.name = name;
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.roomTypeId = roomTypeId;

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

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

}
