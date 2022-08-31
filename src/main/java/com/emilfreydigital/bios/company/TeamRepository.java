package com.emilfreydigital.bios.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query("SELECT t FROM Team t WHERE t.Code = ?1")
    public Optional<Team> getTeamByCode(String code);

    @Query("SELECT t FROM Team t WHERE t.Name = ?1")
    public Optional<Team> getTeamByName(String name);

}
