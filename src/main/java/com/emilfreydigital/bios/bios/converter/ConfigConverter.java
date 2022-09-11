package com.emilfreydigital.bios.bios.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.bios.dto.ConfigDto;
import com.emilfreydigital.bios.bios.model.Config;
import org.springframework.stereotype.Component;

@Component
public final class ConfigConverter extends Converter<ConfigDto, Config> {

    public ConfigConverter() {
        super(ConfigConverter::convertToEntity, ConfigConverter::convertToDto);
    }

    private static ConfigDto convertToDto(Config model) {
        return new ConfigDto(model.getId(), model.getPropertyCode(), model.getPropertyValue(), model.getDescription());
    }

    private static Config convertToEntity(ConfigDto dto) {
        return new Config(dto.getId(), dto.getPropertyCode(), dto.getPropertyValue(), dto.getDescription(), null, null);
    }

}
