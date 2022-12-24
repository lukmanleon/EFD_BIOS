package com.emilfreydigital.bios.bios.service;


import com.emilfreydigital.bios.bios.converter.ConfigConverter;
import com.emilfreydigital.bios.bios.dto.ConfigDto;
import com.emilfreydigital.bios.bios.model.Config;
import com.emilfreydigital.bios.bios.repository.ConfigRepository;
import com.emilfreydigital.bios.exception.ApiRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConfigService {
    Logger logger = LoggerFactory.getLogger(ConfigService.class);
    private final ConfigRepository configRepository;
    private final ConfigConverter configConverter;

    @Autowired
    public ConfigService(ConfigRepository configRepository, ConfigConverter configConverter) {
        this.configRepository = configRepository;
        this.configConverter = configConverter;
    }

    public List<ConfigDto> getAll() {

        try {
            logger.info("CONFIG: Fetching app configuration from database.");
            List<Config> allConfigs = configRepository.findAll();

            logger.info("CONFIG: Processing app configuration data.");
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
            logger.info("CONFIG: Returning app configuration.");
            return configDtoList;

        } catch (Exception e) {
            logger.info("CONFIG - ERROR - Something went wrong while fetching the app configuration." + e.getStackTrace());
            throw new ApiRequestException("An error occurred while getting the configuration data.",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
