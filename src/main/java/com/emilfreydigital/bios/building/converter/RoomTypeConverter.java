package com.emilfreydigital.bios.building.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.building.dto.RoomTypeDto;
import com.emilfreydigital.bios.building.model.RoomType;
import org.springframework.stereotype.Component;

@Component
public final class RoomTypeConverter extends Converter<RoomTypeDto, RoomType> {

    public RoomTypeConverter() {
        super(RoomTypeConverter::convertToEntity, RoomTypeConverter::convertToDto);
    }

    private static RoomTypeDto convertToDto(RoomType model) {
        return new RoomTypeDto(model.getId(), model.getName(), model.getDescription());
    }

    private static RoomType convertToEntity(RoomTypeDto dto) {
        return new RoomType(dto.getId(), dto.getName(), dto.getDescription(), null, null);
    }

}
