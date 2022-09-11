package com.emilfreydigital.bios.building.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.building.dto.RoomDto;
import com.emilfreydigital.bios.building.model.Room;
import org.springframework.stereotype.Component;

@Component
public final class RoomConverter extends Converter<RoomDto, Room> {

    public RoomConverter() {
        super(RoomConverter::convertToEntity, RoomConverter::convertToDto);
    }

    private static RoomDto convertToDto(Room model) {
        return new RoomDto(model.getId(), model.getName(), model.getFloorNumber(), model.getRoomNumber(), model.getRoomTypeId());
    }

    private static Room convertToEntity(RoomDto dto) {
        return new Room(dto.getId(), dto.getName(), dto.getFloorNumber(), dto.getRoomNumber(), dto.getRoomTypeId(), null, null);
    }

}
