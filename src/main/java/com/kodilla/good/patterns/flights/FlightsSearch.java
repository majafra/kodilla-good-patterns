package com.kodilla.good.patterns.flights;

import java.util.List;

public class FlightsSearch {


    public void flightsFrom(String takeoffAirport) {
        ListOfFlights listOfFlights = new ListOfFlights();
        listOfFlights.getList().stream()
                .filter(flight -> flight.getTakeOffAirport()== takeoffAirport)
                .forEach(flight -> System.out.println(flight.toString()));

    }
    public void flightsTo(String destinationAirport) {
        ListOfFlights listOfFlights = new ListOfFlights();
        listOfFlights.getList().stream()
                .filter(flight -> flight.getDestinationAirport() == destinationAirport)
                .forEach(flight -> System.out.println(flight.toString()));
    }
    public void flightsVia(String takeoffAirport,String viaAirport, String destinationAirport) {
        ListOfFlights listOfFlights = new ListOfFlights();
        listOfFlights.getList().stream()
                .filter(flight -> (flight.getTakeOffAirport().equals(takeoffAirport))||(flight.getDestinationAirport().equals(destinationAirport)))
                .filter(flight -> (flight.getDestinationAirport().equals(viaAirport))||(flight.getTakeOffAirport().equals(viaAirport)))
                .forEach(flight -> System.out.println(flight.toString()));
    }
}
