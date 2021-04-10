import java.util.Arrays;

public class User {
    private String email;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;

    private String salt;
    private short[] arrayShort;

    public User(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2) {
        email =  paramString1;
        firstName = paramString2;
        lastName = paramString3;
        yearOfBirth = paramInt1;
        monthOfBirth = paramInt2;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getYear(){
        return String.valueOf(yearOfBirth);
    }

    public String getMonth(){
        return String.valueOf(monthOfBirth);
    }

    
    public void setSalt(String str) {

       salt = str;
    }

    public String getSalt() {       

        return salt;
     }

    public void setHash(short[] arrayOfShort) {
      
        arrayShort = arrayOfShort.clone();
    }

    public boolean checkHash(short[] arrayOfShort) {

         return Arrays.equals(arrayShort, arrayOfShort);
         
    }

}
