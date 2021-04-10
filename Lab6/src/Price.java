public class Price {
    private float price ;
    private  String size;
    private String drink;

    public Price(String size, String drink){
        this.size = size;
        this.drink = drink;

    }

    public float setMenuPrice(){
        if (size.equals("Small")){
            if (drink.equals("Coffee")) {
                this.price += 1.90;
            } else if (drink.equals("Tea")) {
                this.price += 2.00;
            } else if (drink.equals("Decaf")) {
                this.price += 2.10;     
            }
        } else if (size.equals("Medium")){
            if (drink.equals("Coffee")) {
                this.price += 2.40;
            } else if (drink.equals("Tea")) {
                this.price += 2.50;
            } else if (drink.equals("Decaf")) {
                this.price += 2.60;     
            }
        } else if (size.equals("Large")) {
            if (drink.equals("Coffee")) {
                this.price += 3.00;
            } else if (drink.equals("Tea")) {
                this.price += 3.10;
            } else if (drink.equals("Decaf")) {
                this.price += 3.20;     
            }
        }
       return price;
    }

   
    
}
