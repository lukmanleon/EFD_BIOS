package com.emilfreydigital.bios.repository;

import com.emilfreydigital.bios.entity.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryTeam extends CrudRepository<Team, Long> {
    @Query("FROM Team")
    public List<Team> getAllTeams();
}
