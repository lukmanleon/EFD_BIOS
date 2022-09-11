package com.emilfreydigital.bios.bios.service;


import com.emilfreydigital.bios.bios.converter.MultilanguageConverter;
import com.emilfreydigital.bios.bios.dto.MultilanguageDto;
import com.emilfreydigital.bios.bios.model.Multilanguage;
import com.emilfreydigital.bios.bios.repository.MultilanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MultilanguageService {

    private final MultilanguageRepository multilanguageRepository;
    private final MultilanguageConverter multilanguageConverter;

    @Autowired
    public MultilanguageService(MultilanguageRepository multilanguageRepository, MultilanguageConverter multilanguageConverter) {
        this.multilanguageRepository = multilanguageRepository;
        this.multilanguageConverter = multilanguageConverter;
    }

    public List<MultilanguageDto> getAll() {

        List<Multilanguage> allTranslations = multilanguageRepository.findAll();
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
        return translationsDtoList;
    }

}
