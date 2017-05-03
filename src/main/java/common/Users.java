package common;
/**
 * Created by Arpine on 5/1/2017.
 */
public class Users {



    public String UserCredentialsAdmin(String email, String password) {
        UserInputs ADMIN = new UserInputs("Admin", "Qwerty1234", "Admin", "Test", "arpine.stdev@gmail.com", "admin");
        return this.UserCredentialsAdmin(email, password);

        UserInputs USER_REG = new UserInputs("Reg", "123456", "Testreg", "Test", "test_reg@mailinator.com", "reg");
        UserInputs USER_TRIAL = new UserInputs("Trial", "123456", "Testtrial", "Test", "test_trial@mailinator.com", "trial");
        UserInputs ACCESS = new UserInputs("Access", "123456", "Access", "Test", "access@mailinator.com", "access");
        UserInputs GROWTH = new UserInputs("Growth", "123456", "Growth", "Test", "growth@mailinator.com", "growth");
        UserInputs PROTECT = new UserInputs("Protect", "123456", "Protect", "Test", "protect@mailinator.com", "protect");
        UserInputs LAWYER = new UserInputs("Lawyer", "123456", "Lawyer", "Test", "lawyer@mailinator.com", "lawyer");

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



