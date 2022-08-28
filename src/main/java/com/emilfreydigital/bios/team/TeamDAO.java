package com.emilfreydigital.bios.team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TeamDAO extends JpaRepository<Team, Long> {
    @Query("SELECT t FROM Team t WHERE t.Code = ?1")
    public Optional<Team> getTeamByCode(String code);

    @Query("SELECT t FROM Team t WHERE t.Name = ?1")
    public Optional<Team> getTeamByName(String name);

}
