package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flight> list = FlightBuilder.createFlights();

        FiltersController.departureDateBeforeCurrentDate(list);

        FiltersController.segmentsDateArrivalBeforeDateDeparture(list);

        FiltersController.transferOverTwoHour(list);



    }


}
