package com.emilfreydigital.bios.bios.service;


import com.emilfreydigital.bios.bios.converter.ConfigConverter;
import com.emilfreydigital.bios.bios.dto.ConfigDto;
import com.emilfreydigital.bios.bios.model.Config;
import com.emilfreydigital.bios.bios.repository.ConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConfigService {

    private final ConfigRepository configRepository;
    private final ConfigConverter configConverter;

    @Autowired
    public ConfigService(ConfigRepository configRepository, ConfigConverter configConverter) {
        this.configRepository = configRepository;
        this.configConverter = configConverter;
    }

    public List<ConfigDto> getAll() {
        List<Config> allConfigs = configRepository.findAll();
        List<ConfigDto> configDtoList = null;

        if (!(allConfigs == null) && !(allConfigs.isEmpty())) {
            ConfigDto temporaryDto = null;
            for (Config c : allConfigs) {
                temporaryDto = configConverter.convertFromEntity(c);
                if (configDtoList != null) {
                    if (!configDtoList.contains(temporaryDto)) {
                        configDtoList.add(temporaryDto);
                    }
                } else {
                    configDtoList = new ArrayList<>();
                    configDtoList.add(temporaryDto);
                }
            }
        }
        return configDtoList;
    }

}
