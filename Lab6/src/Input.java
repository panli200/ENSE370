import java.util.Scanner;
import java.util.HashMap;
import java.lang.NumberFormatException;

public class Input {

    private Scanner scanner;

    public static Input singleton = null;

    private Input (){
        this.scanner = new Scanner(System.in);
    }

    public static Input getInput () {
        if (singleton == null){
          singleton = new Input();
        }
        return singleton;
    }

    public String getString (String prompt, 
                                   HashMap<String, String> lettersToStrings){
        // loop until we get a legal value
        while (true) {
            System.out.println(prompt);
            String inputEntry = this.scanner.nextLine();
            inputEntry = inputEntry.toUpperCase();
            if (lettersToStrings.containsKey(inputEntry)) {
                return lettersToStrings.get(inputEntry);
            }
            System.out.println("Illegal value, try again!");
        }
    }

    public int getInt (String prompt){
       int number = 0;
        while (true) {
            System.out.println(prompt);
            String inputEntry = this.scanner.nextLine();
           
            try {       
                 number = Integer.parseInt(inputEntry);
                if (number >= 0) {
                    return number;            
                }

                System.out.println("Not a legal number, try again!");
            } catch (NumberFormatException e) {
                System.out.println("Not a legal number, try again!"); 
            } 
           
        }
    }
}