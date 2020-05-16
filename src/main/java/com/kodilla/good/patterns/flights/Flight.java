package com.kodilla.good.patterns.flights;

public class Flight {

    private String takeOffAirport;
    private String destinationAirport;
    private double timeOfFlight;

    public Flight(String takeOffAirport, String destinationAirport,double timeOfFlight) {
        this.takeOffAirport = takeOffAirport;
        this.destinationAirport = destinationAirport;
        this.timeOfFlight = timeOfFlight;
    }

    public String getTakeOffAirport() {
        return takeOffAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public double getTimeOfFlight() {
        return timeOfFlight;
    }
    @Override
    public String toString() {
        return "flight=" + this.getTakeOffAirport()+"-"+this.getDestinationAirport()+", "+this.getTimeOfFlight();
    }
}
