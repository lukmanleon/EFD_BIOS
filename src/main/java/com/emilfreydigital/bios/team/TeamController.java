package com.emilfreydigital.bios.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TeamController {

    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public List<Team> team() {
        return teamService.getAll();
    }

    @RequestMapping(value = "/team/{id}", method = RequestMethod.GET)
    public Team getTeamById(@PathVariable(value = "id") Long id) {
        return teamService.getTeamById(id);
    }

    @RequestMapping(value = "/team/code/{code}", method = RequestMethod.GET)
    public Team getTeamByCode(@PathVariable(value = "code") String teamCode) {
        return teamService.getTeamByCode(teamCode);
    }

    @RequestMapping(value = "/team/name/{name}", method = RequestMethod.GET)
    public Team getTeamByName(@PathVariable(value = "name") String teamName) {
        return teamService.getTeamByName(teamName);
    }

    @RequestMapping(value = "/team/create", method = RequestMethod.POST)
    public Team createTeam(@Valid @RequestBody Team teamEntity) {
        return teamService.createTeam(teamEntity);
    }

    @RequestMapping(value = "/teams/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteTeam(@PathVariable(value = "id") Long id) {
        return teamService.deleteTeam(id);
    }

    @RequestMapping(value = "/teams/update/{id}", method = RequestMethod.PUT)
    public Team updateSample(@PathVariable(value = "id") Long id,
                             @Valid @RequestBody Team sampleEntity) {
        return teamService.updateTeam(id, sampleEntity);
    }
}
