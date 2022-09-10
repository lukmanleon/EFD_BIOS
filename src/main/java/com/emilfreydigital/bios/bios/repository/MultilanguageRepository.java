package com.emilfreydigital.bios.bios.repository;

import com.emilfreydigital.bios.bios.model.Multilanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultilanguageRepository extends JpaRepository<Multilanguage, Long> {
}
