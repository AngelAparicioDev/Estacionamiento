package com.ceiba.adn.estacionamiento.infraestructure.persist.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.estacionamiento.infraestructure.persist.entities.TicketEntity;

public interface ParkingRepositoryJPA extends JpaRepository<TicketEntity, Long> {
	
	

}