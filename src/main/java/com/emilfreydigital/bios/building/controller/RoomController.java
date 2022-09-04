package com.emilfreydigital.bios.building.controller;

import com.emilfreydigital.bios.building.model.Room;
import com.emilfreydigital.bios.building.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/rooms")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping
    public List<Room> rooms() {
        return roomService.getAll();
    }
}