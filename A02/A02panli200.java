
/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281 
 * Class: A02panli200 Project
 * used pattern : MVC Pattern; Composite Pattern; Decorator Pattern
 * 
 */

public class A02panli200 {

    public static void main(String[] args) {

        FlightModel flightModel = new FlightModel();
        //adding the database
        flightModel.addFlight();

        FlightView flightView = new FlightView();

        FlightController flightController = new FlightController(flightModel, flightView);

        flightController.readUserInput();

    }
}
