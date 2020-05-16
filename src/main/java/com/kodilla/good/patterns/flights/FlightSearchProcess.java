package com.kodilla.good.patterns.flights;

public class FlightSearchProcess {

    public static void main(String[] args) {

        FlightsSearch flightsSearch = new FlightsSearch();
        System.out.println("Loty do...");
        flightsSearch.flightsTo("Berlin");
        System.out.println("Loty z...");
        flightsSearch.flightsFrom("Berlin");
        System.out.println("Loty przez...");
        flightsSearch.flightsVia("Warsaw","Berlin","Moscow");
    }
}


