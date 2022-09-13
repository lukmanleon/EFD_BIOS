package com.emilfreydigital.bios.building.dto;

public class RoomDto {

    private Long id;
    private String name;
    private Integer floorNumber;
    private Integer roomNumber;
    private RoomTypeDto roomTypeDto;


    public RoomDto() {
    }

    public RoomDto(Long id, String name, Integer floorNumber, Integer roomNumber, RoomTypeDto roomTypeDto) {
        this.id = id;
        this.name = name;
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.roomTypeDto = roomTypeDto;
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

    public RoomTypeDto getRoomType() {
        return roomTypeDto;
    }

    public void setRoomType(RoomTypeDto roomTypeDto) {
        this.roomTypeDto = roomTypeDto;
    }
}
