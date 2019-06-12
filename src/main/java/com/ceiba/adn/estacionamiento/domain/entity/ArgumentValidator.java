package com.ceiba.adn.estacionamiento.domain.entity;

import com.ceiba.adn.estacionamiento.domain.exception.VehicleInParkingException;

public class ArgumentValidator {

	private ArgumentValidator() {}
	
	public static void validateRequired(Object value,String message) {
		if(value == null || value.equals("")) {
			throw new VehicleInParkingException(message);
		}
	}
	
	public static void validateDateRequired(Object value,String message) {
		if(value == null) {
			throw new VehicleInParkingException(message);
		}
	}
	
	public static void validateTypeVehicle(Object value,String message) {
		if(!value.equals("MOTO") && !value.equals("CARRO")) {
			throw new VehicleInParkingException(message);
		}
	}
}
