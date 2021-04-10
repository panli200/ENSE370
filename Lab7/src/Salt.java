

public class Salt {

    public static String getSalt(User user) {

        String fullName = user.getFirstName() + user.getLastName();

        return user.getLastName() + user.getMonth() + CharSort.sortString(fullName) + user.getYear() + user.getFirstName() ;
  
    }

}
