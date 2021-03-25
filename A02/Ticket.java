/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281
 * Class: Ticket , which is the subclass of Flight and 
 * 
 */
public class Ticket extends Flight implements AbstractTicket {

    public Ticket(String departureCity, String arrivalCity, int departureTime, int price) {
        super(departureCity, arrivalCity, departureTime, price);
    }

    public int updatePrice() {
        return super.getPrice();
    }

}
