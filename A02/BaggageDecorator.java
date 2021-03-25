/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281
 * class: BaggageDecorator
 * Price for adding baggage is extra $20
 */
public class BaggageDecorator extends AbstractTicketDecorator {

    protected AbstractTicket abstractTicket;

    public BaggageDecorator(AbstractTicket abstractTicket) {
        this.abstractTicket = abstractTicket;
    }

    public int updatePrice() {
        return 20 + this.abstractTicket.updatePrice();
    }
}
