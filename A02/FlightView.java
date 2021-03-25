/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281 
 * Class: FlightView
 * This class for display all the flight information 
 */

public class FlightView {

    public void displayFlights(Flight flight, String choiceSeat, String choiceMeal, String choiceBaggage,
            AbstractTicket finalTicket) {
        System.out.println("Your final flight information is :");

        System.out.print("Departure City : ");
        System.out.println(flight.getDepartureCity());

        System.out.print("Arrival City : ");
        System.out.println(flight.getArrivalCity());

        System.out.print("Time : ");
        // The time is integer, if just 3 digital number, adding an extra 0 at the beginning
        if (flight.getDepartureTime() < 1000)
            System.out.println("0" + flight.getDepartureTime() + "H");
        else
            System.out.println(flight.getDepartureTime() + "H");

        System.out.print("Extra Legroom : ");
        System.out.println(choiceSeat);

        System.out.print("In-flight meals : ");
        System.out.println(choiceMeal);

        System.out.print("Excess Baggage : ");
        System.out.println(choiceBaggage);

        System.out.print("Total Price : ");
        System.out.println(finalTicket.updatePrice());

    }

}
