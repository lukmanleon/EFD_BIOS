package com.emilfreydigital.bios.building.service;


import com.emilfreydigital.bios.building.model.RoomType;
import com.emilfreydigital.bios.building.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeService {

    @Autowired
    RoomTypeRepository roomTypeRepository;

    public List<RoomType> getAll() {
        return (List<RoomType>) roomTypeRepository.findAll();
    }

}
