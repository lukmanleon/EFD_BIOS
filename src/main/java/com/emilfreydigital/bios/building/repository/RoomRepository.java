package com.emilfreydigital.bios.building.repository;

import com.emilfreydigital.bios.building.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
