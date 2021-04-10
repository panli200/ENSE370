import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MakerDemoTest {
    
    // Three tests for coffee codes
    @Test
    public void Small_DoubleDoubleCoffee_CorrectCode(){
      
        AbstractMaker firstCoffee = new DrinkMaker("Small", "Coffee");

        int numSugars = 2;
        int numCreams = 2;

        for(int i=0; i<numSugars; i++){
            firstCoffee = new SugarDecorator(firstCoffee);
        }

        for(int i=0; i<numCreams; i++){
            firstCoffee = new CreamDecorator(firstCoffee);
        }

        String coffeeCode = Output.sendCoffeeCode("Small", firstCoffee.getIngredients(), "Coffee");
        String correctValue = "$$@@CCCCC";   
        assertTrue(coffeeCode.equals(correctValue));
    }


    @Test
    public void Medium_SingleSingleTea_CorrectCode(){

        AbstractMaker firstCoffee = new DrinkMaker("Medium", "Tea");

        int numSugars = 1;
        int numCreams = 1;

        for(int i=0; i<numSugars; i++){
            firstCoffee = new SugarDecorator(firstCoffee);
        }

        for(int i=0; i<numCreams; i++){
            firstCoffee = new CreamDecorator(firstCoffee);
        }

        String coffeeCode = Output.sendCoffeeCode("Medium", firstCoffee.getIngredients(), "Tea");
        String correctValue = "$@TTTTTTTTTTTT";   
        assertTrue(coffeeCode.equals(correctValue));
    }


    @Test
    public void Large_BlackDecaf_CorrectCode(){
      
        AbstractMaker firstCoffee = new DrinkMaker("Large", "Decaf");

        String coffeeCode = Output.sendCoffeeCode("Large", firstCoffee.getIngredients(), "Decaf");
        String correctValue = "DDDDDDDDDDDDDDDDDDDD";
       
        assertTrue(coffeeCode.equals(correctValue));
    }

    // Three tests for prices
    @Test
    public void Small_DoubleDoubleCoffee_240(){
       
        AbstractMaker firstCoffee = new DrinkMaker("Small", "Coffee");

        int numSugars = 2;
        int numCreams = 2;

        for(int i=0; i<numSugars; i++){
            firstCoffee = new SugarDecorator(firstCoffee);
        }

        for(int i=0; i<numCreams; i++){
            firstCoffee = new CreamDecorator(firstCoffee);
        }

        String coffeeCode = Float.toString(firstCoffee.getPrice());      
        String correctValue = "2.4";
        assertTrue(coffeeCode.equals(correctValue));

    }

    @Test
    public void Medium_SingleSingleTea_275(){

        AbstractMaker firstCoffee = new DrinkMaker("Medium", "Tea");

        int numSugars = 1;
        int numCreams = 1;

        for(int i=0; i<numSugars; i++){
            firstCoffee = new SugarDecorator(firstCoffee);
        }

        for(int i=0; i<numCreams; i++){
            firstCoffee = new CreamDecorator(firstCoffee);
        }

        String coffeeCode = Float.toString(firstCoffee.getPrice());      
        String correctValue = "2.75";
        assertTrue(coffeeCode.equals(correctValue));
    }

 
    @Test
    public void Large_BlackDecaf_320(){
        
        AbstractMaker firstCoffee = new DrinkMaker("Large", "Decaf");

        String coffeeCode = Float.toString(firstCoffee.getPrice());      
        String correctValue = "3.2";
        assertTrue(coffeeCode.equals(correctValue));
    }
  
    // Three tests for coffe printing
    @Test
    public void Small_DoubleDoubleCoffee_ASCIIArt(){
       

        AbstractMaker firstCoffee = new DrinkMaker("Small", "Coffee");

        int numSugars = 2;
        int numCreams = 2;

        for(int i=0; i<numSugars; i++){
            firstCoffee = new SugarDecorator(firstCoffee);
        }

        for(int i=0; i<numCreams; i++){
            firstCoffee = new CreamDecorator(firstCoffee);
        }
       
        String [] output =  Output.printCoffee("Small", firstCoffee.getIngredients(), "Coffee");
        assertTrue(output[4].equals("  \\ C C C C C /"));
        assertTrue(output[3].equals("   \\ C C C C /"));
        assertTrue(output[2].equals("    \\ @ @ C /"));
        assertTrue(output[1].equals("     \\ $ $ /"));
        assertTrue(output[0].equals("      \\___/"));
    }
 
    @Test
    public void Medium_SingleSingleTea_ASCIIArt(){

        AbstractMaker firstCoffee = new DrinkMaker("Medium", "Tea");

        int numSugars = 1;
        int numCreams = 1;

        for(int i=0; i<numSugars; i++){
            firstCoffee = new SugarDecorator(firstCoffee);
        }

        for(int i=0; i<numCreams; i++){
            firstCoffee = new CreamDecorator(firstCoffee);
        }
       
        String [] output =  Output.printCoffee("Medium", firstCoffee.getIngredients(), "Tea");


        assertTrue(output[5].equals(" \\ T T T T T T /"));
        assertTrue(output[4].equals("  \\ T T T T T /"));
        assertTrue(output[3].equals("   \\ T T T T /"));
        assertTrue(output[2].equals("    \\ T T T /"));
        assertTrue(output[1].equals("     \\ $ @ /"));
        assertTrue(output[0].equals("      \\___/"));
    }

    @Test
    public void Large_BlackDecaf_ASCIIArt(){

        AbstractMaker firstCoffee = new DrinkMaker("Large", "Decaf");

        String [] output =  Output.printCoffee("Large", firstCoffee.getIngredients(), "Decaf");

        assertTrue(output[6].equals("\\ D D D D D D D /"));
        assertTrue(output[5].equals(" \\ D D D D D D /"));
        assertTrue(output[4].equals("  \\ D D D D D /"));
        assertTrue(output[3].equals("   \\ D D D D /"));
        assertTrue(output[2].equals("    \\ D D D /"));
        assertTrue(output[1].equals("     \\ D D /"));
        assertTrue(output[0].equals("      \\___/"));
    }
    
}