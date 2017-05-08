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


    public String getValue(String key1, String key2) {
        return (String) userMap.get(key1).get(key2);
    }

    public UserInputs(String username, String password, String firstName, String lastName, String email, String type) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.type = type;

    }

    public String userCredentialsAdmin() {
        this.email = "arpine.stdev@gmail.com";
        this.password = "Qwerty1234";
        this.firstName = "Admin";
        this.lastName = "Test";
        this.type = "admin";

        return userCredentialsAdmin();
    }

    public String userCredentialsReg(){
        this.email = "test_reg@mailinator.com";
        this.password = "123456";
        this.firstName = "Testreg";
        this.lastName = "Test";
        this.type = "reg";

        return userCredentialsReg();
    }

    public String userCredentialsTrial(){
        this.email = "test_trial@mailinator.com";
        this.password = "123456";
        this.firstName = "Testtrial";
        this.lastName = "Test";
        this.type = "trial";

        return userCredentialsTrial();
    }

    public String userCredentialsAccess(){
        this.email = "access@mailinator.com";
        this.password = "123456";
        this.firstName = "Access";
        this.lastName = "Test";
        this.type = "access";

        return userCredentialsAccess();
    }

    public String userCredentialsGrowth(){
        this.email = "growth@mailinator.com";
        this.password = "123456";
        this.firstName = "Growth";
        this.lastName = "Test";
        this.type = "growth";

        return userCredentialsGrowth();
    }

    public String userCredentialsProtect(){
        this.email = "protect@mailinator.com";
        this.password = "123456";
        this.firstName = "Protect";
        this.lastName = "Test";
        this.type = "protect";

        return userCredentialsProtect();
    }

    public String userCredentialsLawyer(){
        this.email = "lawyer@mailinator.com";
        this.password = "123456";
        this.firstName = "Lawyer";
        this.lastName = "Test";
        this.type = "lawyer";

        return userCredentialsLawyer();
    }
}