import java.util.HashMap;
import java.util.Scanner;

public class Input {
  public static Input singleton = null;
  
  private Scanner scanner = new Scanner(System.in);
  
  public static Input get() {
    if (singleton == null)
      singleton = new Input(); 
    return singleton;
  }
  
  public String getInput(String paramString, HashMap<String, String> paramHashMap) {
    while (true) {
      System.out.println(paramString);
      String str = this.scanner.nextLine();
      str = str.toUpperCase();
      if (paramHashMap.containsKey(str))
        return paramHashMap.get(str); 
      System.out.println("Illegal value, try again!");
    } 
  }
  
  public String getString(String paramString) {
    System.out.println(paramString);
    return this.scanner.nextLine();
  }
  
  public int getInt(String paramString) {
    int i = 0;
    while (true) {
      System.out.println(paramString);
      String str = this.scanner.nextLine();
      try {
        i = Integer.parseInt(str);
        if (i >= 0)
          return i; 
        System.out.println("Not a legal number, try again!");
      } catch (NumberFormatException numberFormatException) {
        System.out.println("Not a legal number, try again!");
      } 
    } 
  }
}
