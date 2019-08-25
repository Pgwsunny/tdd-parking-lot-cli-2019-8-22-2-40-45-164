package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private final int capacity;
    private Map<ParkingTicket, Car> cars = new HashMap<>();

    public ParkingLot() {
        this(10);
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableParkingPosition() {
        return capacity - cars.size();
    }
    
    public ParkingTicket park(Car car) {
    	if(cars.size() < capacity) {
    		ParkingTicket ticket = new ParkingTicket();
        	cars.put(ticket, car);
        	return ticket;
    	}else {
    		return null;
		}
	}
    
    public Car findCar(ParkingTicket parkingTicket) {
    	Car car = new Car();
    	if(cars.containsKey(parkingTicket)) {
    		car = cars.get(parkingTicket);
    	}else {
    		 car = null;
		}
    	cars.remove(parkingTicket);
    	return car;
    }
    
    public boolean isValidTicket(ParkingTicket parkingTicket) {
    	return cars.containsKey(parkingTicket);
    }
    
}
