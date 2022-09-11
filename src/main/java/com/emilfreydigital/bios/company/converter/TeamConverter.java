package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.company.dto.TeamDto;
import com.emilfreydigital.bios.company.model.Team;
import org.springframework.stereotype.Component;

@Component
public final class TeamConverter extends Converter<TeamDto, Team> {

    public TeamConverter() {
        super(TeamConverter::convertToEntity, TeamConverter::convertToDto);
    }

    private static TeamDto convertToDto(Team model) {
        return new TeamDto(model.getId(), model.getCode(), model.getName(), model.getDescription());
    }

    private static Team convertToEntity(TeamDto dto) {
        return new Team(dto.getId(), dto.getCode(), dto.getName(), dto.getDescription(), null, null);
    }

}
