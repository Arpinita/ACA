package common;


import java.util.HashMap;
import java.util.Map;



public class UserInputs {
    public Map<String, Map> userMap = new HashMap();
    public Map<String, String> userInfo;

    public String getValue(String key1, String key2) {
        return (String) userMap.get(key1).get(key2);
    }

    public void user() {
        User reg = new User();
        User trial = new User();
        User access = new User();
        User growth = new User();
        User protect = new User();
        User lawyer = new User();
        User admin = new User();


        //reg
        userInfo = new HashMap();
        reg.username = "test_reg";
        reg.password = "123456";
        reg.firstName = "Test";
        reg.lastName = "Test";
        reg.email = reg.username + "@mailinator.com";
        userInfo.put("username", reg.username);
        userInfo.put("password", reg.password);
        userInfo.put("firstName", reg.firstName);
        userInfo.put("lastName", reg.lastName);
        userInfo.put("email", reg.email);
        userMap.put("user", userInfo);

        //trial
        userInfo = new HashMap();
        trial.username = "test_reg";
        trial.password = "123456";
        trial.firstName = "Test";
        trial.lastName = "Test";
        trial.email = trial.username + "@mailinator.com";
        userInfo.put("username", trial.username);
        userInfo.put("password", trial.password);
        userInfo.put("firstName", trial.firstName);
        userInfo.put("lastName", trial.lastName);
        userInfo.put("email", trial.email);
        userMap.put("user", userInfo);

        //access
        userInfo = new HashMap();
        access.username = "test_reg";
        access.password = "123456";
        access.firstName = "Test";
        access.lastName = "Test";
        access.email = access.username + "@mailinator.com";
        userInfo.put("username", access.username);
        userInfo.put("password", access.password);
        userInfo.put("firstName", access.firstName);
        userInfo.put("lastName", access.lastName);
        userInfo.put("email", access.email);
        userMap.put("user", userInfo);

        //growth
        userInfo = new HashMap();
        growth.username = "test_reg";
        growth.password = "123456";
        growth.firstName = "Test";
        growth.lastName = "Test";
        growth.email = growth.username + "@mailinator.com";
        userInfo.put("username", growth.username);
        userInfo.put("password", growth.password);
        userInfo.put("firstName", growth.firstName);
        userInfo.put("lastName", growth.lastName);
        userInfo.put("email", growth.email);
        userMap.put("user", userInfo);

        //protect
        userInfo = new HashMap();
        protect.username = "test_reg";
        protect.password = "123456";
        protect.firstName = "Test";
        protect.lastName = "Test";
        protect.email = protect.username + "@mailinator.com";
        userInfo.put("username", protect.username);
        userInfo.put("password", protect.password);
        userInfo.put("firstName", protect.firstName);
        userInfo.put("lastName", protect.lastName);
        userInfo.put("email", protect.email);
        userMap.put("user", userInfo);

        //lawyer
        userInfo = new HashMap();
        lawyer.username = "lawyer";
        lawyer.password = "123456";
        lawyer.firstName = "Lawyer";
        lawyer.lastName = "Test";
        lawyer.email = lawyer.username + "@mailinator.com";
        userInfo.put("username", lawyer.username);
        userInfo.put("password", lawyer.password);
        userInfo.put("firstName", lawyer.firstName);
        userInfo.put("lastName", lawyer.lastName);
        userInfo.put("email", lawyer.email);
        userMap.put("user", userInfo);

        //admin
        userInfo = new HashMap();
        admin.username = "lawyer";
        admin.password = "123456";
        admin.firstName = "Admin";
        admin.lastName = "Test";
        admin.email = admin.username + "@mailinator.com";
        userInfo.put("username", admin.username);
        userInfo.put("password", admin.password);
        userInfo.put("firstName", admin.firstName);
        userInfo.put("lastName", admin.lastName);
        userInfo.put("email", admin.email);
        userMap.put("user", userInfo);

    }
    public static class User{
        public String username;
        public String password;
        public String firstName;
        public String lastName;
        public String email;

    }
}