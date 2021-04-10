import java.util.HashMap;

public class MakerDemo {

    public static void main(String[] args) {

        final String size = Input.getInput().getString("What size? [S]mall, [M]edium or [L]arge?",
                new HashMap<String, String>() {
                    {
                        put("S", "Small");
                        put("M", "Medium");
                        put("L", "Large");
                    }
                });

        final String drink = Input.getInput().getString("What would you like? [C]offee, [T]ea or [D]ecaf?",
                new HashMap<String, String>() {
                    {
                        put("C", "Coffee");
                        put("T", "Tea");
                        put("D", "Decaf");
                    }
                });

        int numSugars = Input.getInput().getInt("How many Sugar? [0 or more]");
        int numCreams = Input.getInput().getInt("How many Creams? [0 or more]");

        AbstractMaker firstCoffee = new DrinkMaker(size, drink);

        for (int i = 0; i < numSugars; i++) {
            firstCoffee = new SugarDecorator(firstCoffee);
        }

        for (int i = 0; i < numCreams; i++) {
            firstCoffee = new CreamDecorator(firstCoffee);
        }

        Output.printCoffeeArray(Output.printCoffee(size, firstCoffee.getIngredients(), drink));

        System.out.println("Your drink will cost: " + String.format("%.2f", firstCoffee.getPrice()));

        System.out.println("Drink code: " + Output.sendCoffeeCode(size, firstCoffee.getIngredients(), drink));

    }

}
