public class Output {

     // replace a char
     public static String replaceChar(String oldString, int index, String newChar) {
        return oldString.substring(0, index) + newChar + oldString.substring(index + 1);
    }

   
    public static void printCoffeeArray(String[] coffeeASCII) {
        int numberRows = coffeeASCII.length;
        
        // actually print out the cup!
        for (int i = numberRows - 1; i >= 0; i--) {

            System.out.println(coffeeASCII[i]);
        }
    }

    // print the coffee, and optionally compute and print the price!
    // sizes can be: "Small", "Medium" or "Large"
    // ingredients are a string of symbols, e.g. double double = "$$@@"
    // base is the base drink, e.g. "Coffee" or "Tea"
    // orderComplete tells the printer to prints the price, only when complete!
    public static String[] printCoffee(String size, String ingredients, String drink) {

        //output is an array of strings

        final int stringSize = 7;
        String[] printCup = new String[stringSize];

        // make the cup taller if we are large or medium
        if (size.equals("Large")) {
            printCup[6] = "\\               /";
        }else
            printCup[6]="";

        if (size.equals("Medium") || size.equals("Large")) {
            printCup[5] = " \\             /";
        }else
            printCup[5]="";
        printCup[4] = "  \\           /";
        printCup[3] = "   \\         /";
        printCup[2] = "    \\       /";
        printCup[1] = "     \\     /";
        printCup[0] = "      \\___/";

        // how many symbols we can fit in each row
        int[] max_ingredients = { 2, 3, 4, 5, 6, 7 };

        // how many rows we will fill depending on size
        int numberRows = 4;
        
        if (size.equals("Medium")) {
            numberRows = 5;
        }
        if (size.equals("Large")) {
            numberRows = 6;
        }

        // loop through the symbol spots in our empty cup...
        int ingredientNum = 0;
        int maxIngredients = ingredients.length();
        for (int i = 0; i < numberRows; i++) {
            // padding
            int offset = stringSize - i;
            for (int j = 0; j < max_ingredients[i]; j++) {
                int replaceIndex = offset + 2*j; 
                // if we have ingredients remaining print one...
                if (ingredientNum < maxIngredients) {
                    printCup[i + 1] = replaceChar(printCup[i + 1], replaceIndex,
                            ingredients.substring(ingredientNum, ingredientNum + 1));
                    ingredientNum++; // advance ingredient pointer
                    // ... otherwise print some beverage
                } else {
                    printCup[i + 1] = replaceChar(printCup[i + 1], replaceIndex, drink.substring(0, 1));
                }
            }
            System.out.println();
        }
        return printCup;
    }

    // simulates sending the coffee code by printing it to the screen
    public static String sendCoffeeCode(String size, String ingredients, String drink) {
        
        final int numSymbolsSmall = 9;
        final int numSymbolsMedium = 14;
        final int numSymbolsLarge = 20;

        // the coffee code is the ingredients array, followed by
        // the first letter of the base drink repeated up until
        // enough symbols for the cup are filled

        if (size.equals("Small")) {
            return sendCodeHelper(numSymbolsSmall, ingredients, drink);
        } else if (size.equals("Medium")) {
            return sendCodeHelper(numSymbolsMedium, ingredients, drink);
        } else { 
            return sendCodeHelper(numSymbolsLarge, ingredients, drink);
        }

    }

    public static String sendCodeHelper(int numSymbols, String ingredients, String drink) {
        String output = "";
        if (ingredients.length() > numSymbols) {
            output = ingredients.substring(0, numSymbols);
        } else {
            output = ingredients;
            for (int i = output.length(); i < numSymbols; i++) {
                output += drink.substring(0, 1);
            }
        }
        return output;

    }

    
}
