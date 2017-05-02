package common;


import java.lang.reflect.Array;

import static common.TAGS.*;

/**
 * Created by Arpine on 5/1/2017.
 */
public class Users {

    public static void UserCredentials(int type) {
        UserInputs ADMIN = new UserInputs("Vladik", "Kaka", "123456", "last", "tajik@gmail.com", "admin");
        UserInputs USER_REG = new UserInputs()
        String email = "";
        String password = "";
        switch (type) {
            case ADMIN:
                email = user.getValue("admin", "admin.email");
                password = user.getValue("admin", "admin.password");
                break;
            case USER_REG:
                email = user.getValue("reg", "reg.email");
                password = user.getValue("reg", "reg.password");
                break;
            case USER_TRIAL:
                email = user.getValue("trial", "trial.email");
                password = user.getValue("trial", "trial.password");
                break;
            case ACCESS:
                email = user.getValue("access", "access.email");
                password = user.getValue("access", "access.password");
                break;
            case GROWTH:
                email = user.getValue("growth", "growth.email");
                password = user.getValue("growth", "growth.password");
                break;
            case PROTECT:
                email = user.getValue("protect", "protect.email");
                password = user.getValue("protect", "protect.password");
                break;
            case LAWYER:
                email = user.getValue("lawyer", "lawyer.email");
                password = user.getValue("lawyer", "lawyer.password");
                break;
        }
    }
}

//    public static void login(String Username, String Password) {
//        $("#Login").waitUntil(appear, 5000).click();
//        $("#username").setValue(Username);
//        $("#password").setValue(Password);
//        $("#login").click();
//    }
//
//    public static void logOut() {
//        if ($("#Logout").isDisplayed())
//            $("#Logout").click();
//    }
//
//    public void edit() {
//        this.auto = inputs.auto;
//        this.id = inputs.id();
//        this.email = inputs.email;
//        $("#first_name").setValue(auto);
//        $("#last_name").setValue(auto);
//        $("#Email_Address").setValue(email);
//    }
//    public void editIndividual() {
//        this.auto = inputs.auto;
//        this.id = inputs.id();
//        this.email = inputs.email;
//        $("#first_name").setValue(auto);
//        $("#last_name").setValue(auto);
//        $("#Email_Address").setValue(email);
//        $("#phone").setValue(inputs.phone);
//        $("#address").setValue(auto);
//        $("#id_number").setValue(id);
//    }
//    public void editAirbnb() {
//        this.auto = inputs.auto;
//        this.id = inputs.id();
//        this.email = inputs.email;
//        $("#first_name").setValue(auto);
//        $("#last_name").setValue(auto);
//        $("#property_id").setValue(auto);
//        $("#Email_Address").setValue(email);
//        $("#phone").setValue(inputs.phone);
//        $("#address").setValue(auto);
//        $("#id_number").setValue(id);
//    }
//
//    public void checkEdit(String auto) {
//        this.auto = inputs.auto;
//        this.id = inputs.id();
//        this.email = inputs.email;
//        $("#first_name").shouldHave(value(auto));
//        $("#last_name").shouldHave(value(auto));
//        $("#Email_Address").shouldHave(value(email));
//    }
//    public void checkEditIndividual(String auto) {
//        this.auto = inputs.auto;
//        this.email = inputs.email;
//        $("#first_name").shouldHave(value(auto));
//        $("#last_name").shouldHave(value(auto));
//        $("#phone").shouldHave(value(inputs.phone));
//        $("#id_number").shouldHave(value(id));
//        $("#Email_Address").shouldHave(value(email));
//    }
//    public void checkEditAirbnb(String auto) {
//        this.auto = inputs.auto;
//        this.email = inputs.email;
//        $("#first_name").shouldHave(value(auto));
//        $("#last_name").shouldHave(value(auto));
//        $("#property_id").shouldHave(value(auto));
//        $("#phone").shouldHave(value(inputs.phone));
//        $("#id_number").shouldHave(value(id));
//        $("#Email_Address").shouldHave(value(email));
//    }
//
//    public void CreateUser(int role) {
//        switch (role) {
//            case ADMIN:
//                edit();
//                $("#Save").click();
//                break;
//            case INSURER:
//                edit();
//                $$(inputs.combobox).get(1).click();
//                functions.arrowDownEnter();
//                $("#Save").click();
//                break;
//            case CORPORATION:
//                edit();
//                sleep(500);
//                $$(inputs.combobox).get(1).click();
//                functions.arrowDownEnter();
//                $("#Save").click();
//                break;
//            case MERCHANT:
//                edit();
//                $$(inputs.combobox).get(1).click();
//                functions.arrowDownEnter();
//                $("#Save").click();
//                break;
//            case INDIVIDUAL:
//                editIndividual();
//                $("#Save").click();
//                break;
//            case AIRBNBUSER:
//                editAirbnb();
//                $("#Save").click();
//                break;
//        }
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getAuto() {
//        return auto;
//    }
//}



