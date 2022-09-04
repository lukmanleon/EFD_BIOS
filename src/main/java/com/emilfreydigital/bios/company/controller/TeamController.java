package com.emilfreydigital.bios.company.controller;

import com.emilfreydigital.bios.company.dto.TeamDto;
import com.emilfreydigital.bios.company.model.Team;
import com.emilfreydigital.bios.company.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/bios/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<TeamDto> team() {
        return teamService.getAll();
    }

    @GetMapping(value = "/{id}")
    public TeamDto getTeamById(@PathVariable(value = "id") Long id) {
        return teamService.getTeamById(id);
    }

    @GetMapping(value = "/code/{code}")
    public Team getTeamByCode(@PathVariable(value = "code") String teamCode) {
        return teamService.getTeamByCode(teamCode);
    }

    @GetMapping(value = "/name/{name}")
    public Team getTeamByName(@PathVariable(value = "name") String teamName) {
        return teamService.getTeamByName(teamName);
    }

    @PostMapping(value = "/create")
    public Team createTeam(@Valid @RequestBody Team teamEntity) {
        return teamService.createTeam(teamEntity);
    }

    @PutMapping(value = "/update/{id}")
    public Team updateSample(@PathVariable(value = "id") Long id,
                             @Valid @RequestBody Team sampleEntity) {
        return teamService.updateTeam(id, sampleEntity);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Object> deleteTeam(@PathVariable(value = "id") Long id) {
        return teamService.deleteTeam(id);
    }

}
