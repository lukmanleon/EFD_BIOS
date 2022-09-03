package com.emilfreydigital.bios.building.controller;

import com.emilfreydigital.bios.building.model.RoomType;
import com.emilfreydigital.bios.building.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bios/roomtypes")
public class RoomTypeController {

    @Autowired
    RoomTypeService roomTypeService;

    @GetMapping
    public List<RoomType> rooms() {
        return roomTypeService.getAll();
    }
}
