package com.emilfreydigital.bios.building.service;


import com.emilfreydigital.bios.building.repository.RoomRepository;
import com.emilfreydigital.bios.building.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public List<Room> getAll() {
        return (List<Room>) roomRepository.findAll();
    }

}
