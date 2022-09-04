package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.company.dto.TeamDto;
import com.emilfreydigital.bios.company.model.Team;

public final class TeamConverter {

    public static TeamDto toDto(Team model) {
        TeamDto dto = new TeamDto();
        dto.setId(model.getId());
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());

        return dto;
    }

    public static Team toModel(TeamDto dto) {
        Team model = new Team();
        model.setId(dto.getId());
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setDescription(dto.getDescription());

        return model;
    }
}
