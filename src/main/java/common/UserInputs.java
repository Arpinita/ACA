package common;

import java.util.HashMap;
import java.util.Map;



public class UserInputs {

    public String username;
    public String password;
    public String firstName;
    public String lastName;
    public String email;
    public String type;

   public Map<String, Map> userMap = new HashMap();


   public String getValue(String key1, String key2) {return (String) userMap.get(key1).get(key2);}

    public UserInputs(String username,String password,String firstName,String lastName,String email,String type) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.type = type;
    }
}