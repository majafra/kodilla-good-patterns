package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ListOfFlights {

    Flight flight;
    List<Flight> routes = new ArrayList<Flight>();

    public ListOfFlights() {

        routes.add(new Flight("Warsaw", "Berlin", 8.00));
        routes.add(new Flight("Moscow", "Berlin", 8.45));
        routes.add(new Flight("Warsaw", "Moscow", 8.55));
        routes.add(new Flight("Berlin", "Moscow", 9.00));
    }

    public List<Flight> getList() {
        return new ArrayList<Flight>(routes);
    }
}

