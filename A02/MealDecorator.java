/**
 * ENSE 370 Assignment 2 
 * Author: Li Pan 200371281
 * class: MealDecorator
 * Price for adding baggage is extra $10
 */
public class MealDecorator extends AbstractTicketDecorator {

    protected AbstractTicket abstractTicket;

    public MealDecorator(AbstractTicket abstractTicket) {
        this.abstractTicket = abstractTicket;

    }

    public int updatePrice() {
        return 10 + this.abstractTicket.updatePrice();
    }
}
