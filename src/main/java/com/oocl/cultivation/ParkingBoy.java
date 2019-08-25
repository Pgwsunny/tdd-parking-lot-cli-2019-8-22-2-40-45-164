package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
    	ParkingTicket ticket = parkingLot.park(car);
    	if(ticket==null) {
    		lastErrorMessage = "The parking lot is full.";
    	}else {
    		lastErrorMessage = null;
		}
        return ticket;
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
    	if(ticket == null) {
    		lastErrorMessage = "Please provide your parking ticket.";
    	}else if(!new ParkingLot().isValidTicket(ticket)) {
    		lastErrorMessage = "Unrecognized parking ticket.";
		}else {
			lastErrorMessage = null;
		}
    	Car car = parkingLot.findCar(ticket);
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
