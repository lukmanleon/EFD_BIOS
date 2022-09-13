package com.emilfreydigital.bios.building.service;


import com.emilfreydigital.bios.building.converter.RoomConverter;
import com.emilfreydigital.bios.building.converter.RoomTypeConverter;
import com.emilfreydigital.bios.building.dto.RoomDto;
import com.emilfreydigital.bios.building.model.Room;
import com.emilfreydigital.bios.building.model.RoomType;
import com.emilfreydigital.bios.building.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomConverter roomConverter;
    private final RoomTypeConverter roomTypeConverter;

    @Autowired
    public RoomService(RoomRepository roomRepository, RoomConverter roomConverter, RoomTypeConverter roomTypeConverter) {
        this.roomRepository = roomRepository;
        this.roomConverter = roomConverter;
        this.roomTypeConverter = roomTypeConverter;
    }

    public List<RoomDto> getAll() {

        List<Room> allRooms = roomRepository.findAll();
        List<RoomDto> projectDtoList = null;

        if (!(allRooms == null) && !(allRooms.isEmpty())) {
            RoomDto temporaryDto = null;
            RoomType temporaryRoomType = null;

            for (Room r : allRooms) {
                temporaryRoomType = r.getRoomType();
                temporaryDto = roomConverter.convertFromEntity(r);
                temporaryDto.setRoomType(roomTypeConverter.convertFromEntity(temporaryRoomType));
                temporaryRoomType = null;

                if (projectDtoList != null) {
                    if (!projectDtoList.contains(temporaryDto)) {
                        projectDtoList.add(temporaryDto);
                    }
                } else {
                    projectDtoList = new ArrayList<>();
                    projectDtoList.add(temporaryDto);
                }
            }
            temporaryDto = null;
        }
        return projectDtoList;
    }

}
