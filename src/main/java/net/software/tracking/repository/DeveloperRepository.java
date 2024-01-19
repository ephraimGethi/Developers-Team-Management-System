package net.software.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.software.tracking.entity.Developer;

public interface DeveloperRepository extends JpaRepository<Developer,Long>{

}
