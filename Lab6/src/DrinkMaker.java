public class DrinkMaker implements AbstractMaker {

    public String drink;
   
    public String size;
    

    
    public DrinkMaker (String size, String drink ){
        this.drink = drink;
        this.size = size;
        
    }

    @Override
    public String getIngredients() {
       
        return "";
    }

    @Override
    public float getPrice() {

        Price price = new Price(size,drink);
        return price.setMenuPrice();

    }


    
   

}
