package com.emilfreydigital.bios.bios.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.bios.dto.MultilanguageDto;
import com.emilfreydigital.bios.bios.model.Multilanguage;
import org.springframework.stereotype.Component;

@Component
public final class MultilanguageConverter extends Converter<MultilanguageDto, Multilanguage> {

    public MultilanguageConverter() {
        super(MultilanguageConverter::convertToEntity, MultilanguageConverter::convertToDto);
    }

    private static MultilanguageDto convertToDto(Multilanguage model) {
        return new MultilanguageDto(model.getId(), model.getTranslationKey(), model.getEng(), model.getCro(), model.getGer());
    }

    private static Multilanguage convertToEntity(MultilanguageDto dto) {
        return new Multilanguage(dto.getId(), dto.getTranslationKey(), dto.getEng(), dto.getCro(), dto.getGer(), null, null);
    }

}
