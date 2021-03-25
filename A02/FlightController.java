/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281 
 * Class: FlightController
 * 
 */

import java.util.Scanner;

public class FlightController {

    private FlightModel flightModel;
    private FlightView flightView;

    public FlightController(FlightModel flightModel, FlightView flightView) {
        this.flightModel = flightModel;
        this.flightView = flightView;

    }

    public void readUserInput() {

        Flight flight = flightModel.retrieveFlightFromDatabase();

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to add extra legroom seats (Y/N)?");

        String choiceSeat = input.nextLine();

        System.out.println("Do you want to add in-flight meals (Y/N)?");

        String choiceMeal = input.nextLine();

        System.out.println("Do you want to add excess baggage (Y/N)?");

        String choiceBaggage = input.nextLine();

        AbstractTicket firstTicket, secondTicket, finalTicket;

        /** According to the choices from user, create the object with decorator */
        if (choiceSeat.equals("Y"))
            firstTicket = new SeatDecorator(new Ticket(flight.getDepartureCity(), flight.getArrivalCity(),
                    flight.getDepartureTime(), flight.getPrice()));

        else
            firstTicket = new Ticket(flight.getDepartureCity(), flight.getArrivalCity(), flight.getDepartureTime(),
                    flight.getPrice());

        if (choiceMeal.equals("Y"))
            secondTicket = new MealDecorator(firstTicket);

        else
            secondTicket = firstTicket;

        if (choiceBaggage.equals("Y"))
            finalTicket = new BaggageDecorator(secondTicket);

        else
            finalTicket = secondTicket;

        //view the flight 
        flightView.displayFlights(flight, choiceSeat, choiceMeal, choiceBaggage, finalTicket);

    }

}
