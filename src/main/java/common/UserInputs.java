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
    public Map<String, String> userInfo;

    //public String getValue (String key1){ return (String) userMap.get(key1).get(key2)}
    public String getValue(String key1, String key2) {return (String) userMap.get(key1).get(key2);}

    public UserInputs(String username,String password,String firstName,String lastName,String email,String type) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.type = type;
    }


    public void user() {
        User reg = new User();
        User access = new User();
        User growth = new User();
        User protect = new User();
        User trial = new User();
        User lawyer = new User();
        User admin = new User();

        //reg
        userInfo = new HashMap();
        reg.username = "Testreg";
        reg.password = "123456";
        reg.firstName = "Testreg";
        reg.lastName = "Test";
        reg.email = reg.username + "@mailinator.com";


        //trial
        userInfo = new HashMap();
        trial.username = "Trial";
        trial.password = "123456";
        trial.firstName = "Trial";
        trial.lastName = "Test";
        trial.email = trial.username + "@mailinator.com";


        //access
        userInfo = new HashMap();
        access.username = "Access";
        access.password = "123456";
        access.firstName = "Access";
        access.lastName = "Test";
        access.email = access.username + "@mailinator.com";

        //growth
        userInfo = new HashMap();
        growth.username = "Growth";
        growth.password = "123456";
        growth.firstName = "Growth";
        growth.lastName = "Test";
        growth.email = growth.username + "@mailinator.com";


        //protect
        userInfo = new HashMap();
        protect.username = "Protect";
        protect.password = "123456";
        protect.firstName = "Protect";
        protect.lastName = "Test";
        protect.email = protect.username + "@mailinator.com";


        //lawyer
        userInfo = new HashMap();
        lawyer.username = "Lawyer";
        lawyer.password = "123456";
        lawyer.firstName = "Lawyer";
        lawyer.lastName = "Test";
        lawyer.email = lawyer.username + "@mailinator.com";


        //admin
        userInfo = new HashMap();
        admin.username = "Admin";
        admin.password = "123456";
        admin.firstName = "Admin";
        admin.lastName = "Test";
        admin.email = admin.username + "@mailinator.com";
    }
    public static class User {
        public String username;
        public String password;
        public String firstName;
        public String lastName;
        public String email;

    }
}