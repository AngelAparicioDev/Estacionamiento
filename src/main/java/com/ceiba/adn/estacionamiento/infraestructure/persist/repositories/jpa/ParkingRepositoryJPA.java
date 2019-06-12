package com.ceiba.adn.estacionamiento.infraestructure.persist.repositories.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ceiba.adn.estacionamiento.domain.entity.TicketActive;
import com.ceiba.adn.estacionamiento.infraestructure.persist.entities.TicketEntity;

public interface ParkingRepositoryJPA extends JpaRepository<TicketEntity, Long> {
	
	@Query("select new com.ceiba.adn.estacionamiento.domain.entity.TicketActive(te.licensePlate,te.entry,te.typeVehicle) from TicketEntity te where te.status = true")
	List<TicketActive> activeTickets();
	
	@Query("select te  from TicketEntity te where te.status = true and te.licensePlate = :licensePlate")
	TicketEntity findByLicensePlate(@Param("licensePlate") String licensePlate);
	

}
