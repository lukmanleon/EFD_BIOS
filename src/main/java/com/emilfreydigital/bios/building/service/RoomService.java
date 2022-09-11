package com.emilfreydigital.bios.building.service;


import com.emilfreydigital.bios.building.converter.RoomConverter;
import com.emilfreydigital.bios.building.dto.RoomDto;
import com.emilfreydigital.bios.building.model.Room;
import com.emilfreydigital.bios.building.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomConverter roomConverter;

    @Autowired
    public RoomService(RoomRepository roomRepository, RoomConverter roomConverter) {
        this.roomRepository = roomRepository;
        this.roomConverter = roomConverter;
    }

    public List<RoomDto> getAll() {

        List<Room> allRooms = roomRepository.findAll();
        List<RoomDto> projectDtoList = null;

        if (!(allRooms == null) && !(allRooms.isEmpty())) {
            RoomDto temporaryDto = null;
            for (Room r : allRooms) {
                temporaryDto = roomConverter.convertFromEntity(r);
                if (projectDtoList != null) {
                    if (!projectDtoList.contains(temporaryDto)) {
                        projectDtoList.add(temporaryDto);
                    }
                } else {
                    projectDtoList = new ArrayList<>();
                    projectDtoList.add(temporaryDto);
                }
            }
        }
        return projectDtoList;
    }

}
