/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281
 * class: SeatDecorator
 * Price for adding baggage is extra $30
 */
public class SeatDecorator extends AbstractTicketDecorator {
    protected AbstractTicket abstractTicket;

    public SeatDecorator(AbstractTicket abstractTicket) {
        this.abstractTicket = abstractTicket;
    }

    public int updatePrice() {
        return 30 + this.abstractTicket.updatePrice();
    }

}
