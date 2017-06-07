package common;


import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by Arpine on 5/16/2017.
 */
public class DataInputs {

    Inputs inputs = new Inputs();

    public String companyNameData;
    public String address1Data;
    public String address2Data;
    public String cityData;
    public String countyData;
    public String postCodeData;
    public String billingCompanyNameData;
    public String fullNameData;
    public String emailData;
    public String phoneNumberData;
    public String passwordData;
    public String firstNameData;
    public String lastNameData;



    public String companyNameData(){
        this.companyNameData = inputs.randomAtoZ();
        return companyNameData;
    }

    public String address1Data(){
        this.address1Data = inputs.randomAtoZ();
        return address1Data;
    }

    public String address2Data(){
        this.address2Data = inputs.randomAtoZ();
        return address2Data;
    }

    public String cityData(){
        this.cityData = inputs.randomAtoZ();
        return cityData;
    }

    public String countyData(){
        this.countyData = inputs.randomAtoZ();
        return countyData;
    }

    public String postCodeData(){
        this.postCodeData = inputs.randomNumber();
        return postCodeData;
    }

    public String billingCompanyNameData(){
        this.billingCompanyNameData = inputs.randomAtoZ();
        return billingCompanyNameData;
    }

    public String fullNameData(){
        this.fullNameData = inputs.randomAtoZ() +" "+ inputs.randomAtoZ();
        return fullNameData;
    }

    public String emailData(){
        this.emailData = "test"+inputs.randomNumber()+"@mailinator.com";
        return emailData;
    }

    public String phoneNumberData(){
        this.phoneNumberData = inputs.randomNumber();
        return phoneNumberData;
    }

    public String passwordData(){
        this.passwordData = inputs.randomNumber();
        return passwordData;
    }

    public String firstNameData(){
        this.firstNameData = inputs.randomAtoZ();
        return firstNameData;
    }

    public String lastNameData(){
        this.lastNameData = inputs.randomAtoZ();
        return lastNameData;
    }
}
