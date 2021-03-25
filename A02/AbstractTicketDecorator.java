/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281
 * abstract class : AbstractTicketDecorator subclass of AbstractTicket
 * Pattern: Decorator Pattern
 */
public abstract class AbstractTicketDecorator implements AbstractTicket {

    protected AbstractTicket abstractTicket;

    public int updatePrice() {
        return abstractTicket.updatePrice();
    }

}
