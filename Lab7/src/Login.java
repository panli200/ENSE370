import java.util.ArrayList;
import java.util.HashMap;

public class Login {
  private ArrayList<User> users = new ArrayList<>();

  public User login(String email, String password) {
    for (User user : this.users) {
      if (user.getEmail().equals(email)) {
        String str = user.getSalt();
        short[] arrayOfShort = Hash.getHash(password, str);

        if (user.checkHash(arrayOfShort)) {
          System.out.println("User logged in successfully");
          return user;
        }
        System.out.println("Incorrect password");
        return null;
      }
    }
    System.out.println("User not found");
    return null;
  }

  public User register(String email, String firstName, String lastName, int yearOfBirth, int monthOfBirth,
      String password) {
    for (User user1 : this.users) {
      if (user1.getEmail().equals(email)) {
        System.out.println("User already exists");
        return null;
      }
    }
    User user = new User(email, firstName, lastName, yearOfBirth, monthOfBirth);
    String str = Salt.getSalt(user);

    user.setSalt(str);
    short[] arrayOfShort = Hash.getHash(password, str);

    user.setHash(arrayOfShort);
    this.users.add(user);
    System.out.println("User successfully created");
    return user;
  }

  public static void main(String[] paramArrayOfString) {
    Login login = new Login();
    while (true) {
      String str = Input.get().getInput("(R)egister, (L)ogin or (Q)uit?", new HashMap<String, String>() {
        {
          put("R", "Register");
          put("L", "Login");
          put("Q", "Quit");
        }
      });
      if (str.equals("Login")) {
        String email = Input.get().getString("Email:");
        String password = Input.get().getString("Password:");
        User user = login.login(email, password);
        while (user == null) {
          email = Input.get().getString("Email:");
          password = Input.get().getString("Password:");
          user = login.login(email, password);
        }
        continue;
      }
      if (str.equals("Register")) {
        String email = Input.get().getString("Email:");
        String password = Input.get().getString("Password:");
        String firstName = Input.get().getString("First Name:");
        String lastName = Input.get().getString("Last Name:");
        int yearOfBirth = Input.get().getInt("Year of Birth");
        int monthOfBirth = Input.get().getInt("Month of Birth");
        User user = login.register(email, firstName, lastName, yearOfBirth, monthOfBirth, password);
        while (user == null) {
          email = Input.get().getString("Email:");
          password = Input.get().getString("Password:");
          firstName = Input.get().getString("First Name:");
          lastName = Input.get().getString("Last Name:");
          yearOfBirth = Input.get().getInt("Year of Birth");
          monthOfBirth = Input.get().getInt("Month of Birth");
          user = login.register(email, firstName, lastName, yearOfBirth, monthOfBirth, password);
        }
        continue;
      }
      break;
    }
  }
}
