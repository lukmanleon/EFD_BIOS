package com.emilfreydigital.bios.bios.service;


import com.emilfreydigital.bios.bios.converter.MultilanguageConverter;
import com.emilfreydigital.bios.bios.dto.MultilanguageDto;
import com.emilfreydigital.bios.bios.model.Multilanguage;
import com.emilfreydigital.bios.bios.repository.MultilanguageRepository;
import com.emilfreydigital.bios.exception.ApiRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MultilanguageService {
    Logger logger = LoggerFactory.getLogger(MultilanguageService.class);
    private final MultilanguageRepository multilanguageRepository;
    private final MultilanguageConverter multilanguageConverter;

    @Autowired
    public MultilanguageService(MultilanguageRepository multilanguageRepository, MultilanguageConverter multilanguageConverter) {
        this.multilanguageRepository = multilanguageRepository;
        this.multilanguageConverter = multilanguageConverter;
    }

    public List<MultilanguageDto> getAll() {
        try {
            logger.info("MULTILANGUAGE: Fetching app translations from database.");
            List<Multilanguage> allTranslations = multilanguageRepository.findAll();

            logger.info("MULTILANGUAGE: Processing app translations data.");
            List<MultilanguageDto> translationsDtoList = null;
            if (!(allTranslations == null) && !(allTranslations.isEmpty())) {
                MultilanguageDto temporaryDto = null;
                for (Multilanguage m : allTranslations) {
                    temporaryDto = multilanguageConverter.convertFromEntity(m);
                    if (translationsDtoList != null) {
                        if (!translationsDtoList.contains(temporaryDto)) {
                            translationsDtoList.add(temporaryDto);
                        }
                    } else {
                        translationsDtoList = new ArrayList<>();
                        translationsDtoList.add(temporaryDto);
                    }
                }
            }
            logger.info("MULTILANGUAGE: Returning app translations from database.");
            return translationsDtoList;

        } catch (Exception e) {
            logger.info("CONFIG - ERROR - Something went wrong while fetching the app translations." + e.getStackTrace());
            throw new ApiRequestException("An error occurred while getting the configuration data.",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
