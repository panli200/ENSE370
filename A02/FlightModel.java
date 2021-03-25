/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281 
 * Class: FlightModel
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightModel {

    private List<Flight> flights = new ArrayList<Flight>();

    public void addFlight() {

        flights.add(new Flight("Regina", "Vancouver", 900, 300));
        flights.add(new Flight("Regina", "Vancouver", 1500, 350));
        flights.add(new Flight("Regina", "Toronto", 1300, 500));

    }

    public Flight retrieveFlightFromDatabase() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Departure City:");
        String depart = input.nextLine();

        System.out.println("Enter Arrival City :");
        String arrival = input.nextLine();

        for (int i = 0; i < flights.size(); i++) {

            /* Checking the input from user and compare with database */
            if (flights.get(i).getDepartureCity().equals(depart) && flights.get(i).getArrivalCity().equals(arrival)) {

                System.out.println(
                        "(" + (i + 1) + ") " + flights.get(i).getDepartureCity() + " " + flights.get(i).getArrivalCity()
                                + " " + flights.get(i).getDepartureTime() + "H  $" + flights.get(i).getPrice());
            }

        }
        System.out.println("Which flight do you want?");

        String choice = input.nextLine();

        /* Get the choice from customer which the index+1 in the database */
        int index = Integer.parseInt(choice);
        index--;

        Flight flight = flights.get(index);

        return flight;
    }

}
