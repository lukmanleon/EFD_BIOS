package com.emilfreydigital.bios.building.service;


import com.emilfreydigital.bios.building.converter.RoomTypeConverter;
import com.emilfreydigital.bios.building.dto.RoomTypeDto;
import com.emilfreydigital.bios.building.model.RoomType;
import com.emilfreydigital.bios.building.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomTypeService {

    private final RoomTypeRepository roomTypeRepository;
    private final RoomTypeConverter roomTypeConverter;

    @Autowired
    public RoomTypeService(RoomTypeRepository roomTypeRepository, RoomTypeConverter roomTypeConverter) {
        this.roomTypeRepository = roomTypeRepository;
        this.roomTypeConverter = roomTypeConverter;
    }

    public List<RoomTypeDto> getAll() {

        List<RoomType> allRoomTypes = roomTypeRepository.findAll();
        List<RoomTypeDto> roomTypeDtoList = null;

        if (!(allRoomTypes == null) && !(allRoomTypes.isEmpty())) {
            RoomTypeDto temporaryDto = null;

            for (RoomType rt : allRoomTypes) {
                temporaryDto = roomTypeConverter.convertFromEntity(rt);
                if (roomTypeDtoList != null) {
                    if (!roomTypeDtoList.contains(temporaryDto)) {
                        roomTypeDtoList.add(temporaryDto);
                    }
                } else {
                    roomTypeDtoList = new ArrayList<>();
                    roomTypeDtoList.add(temporaryDto);
                }
            }
        }
        return roomTypeDtoList;
    }

}
