package pageObject.signUp;

import common.Inputs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;
import common.DataInputs;

/**
 * Created by Arpine on 5/11/2017.
 */
public class SignUpAccessPage extends Base {

    Actions actions = new Actions(driver);
    Inputs inputs = new Inputs();
    DataInputs dataInputs = new DataInputs();
    String companyNameData = dataInputs.companyNameData();
    String address1Data = dataInputs.address1Data();
    String address2Data = dataInputs.address2Data();
    String cityData = dataInputs.cityData();
    String countyData = dataInputs.countyData();
    String postCodeData = dataInputs.postCodeData();
    String billingCompanyNameData = dataInputs.billingCompanyNameData();
    String fullNameData = dataInputs.fullNameData();
    String emailData = dataInputs.emailData();
    String phoneNumberData = dataInputs.phoneNumberData();
    String passwordData = dataInputs.passwordData();

    @FindBy(xpath = "//a[@class='btn primary access']")
    WebElement accessButton;
    @FindBy(id = "scroll")
    WebElement accessLink;
    @FindBy(xpath = "//*[@id='company_type_chosen']/a")
    WebElement companyType;
    @FindBy(id = "contracting_party")
    WebElement companyName;
    @FindBy(id = "address")
    WebElement address1;
    @FindBy(id = "secondary_address")
    WebElement address2;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "county")
    WebElement county;
    @FindBy(id = "post_code")
    WebElement postCode;
    @FindBy(xpath = "//*[@id='user_companySector_chosen']/a")
    WebElement companySector;
    @FindBy(xpath = "//*[@id='user_companySize_chosen']/a")
    WebElement companySize;
    @FindBy(xpath = "//*[@id='subscriptionSumbit']/div[1]/div/div[1]/div[4]/label/span[1]")
    WebElement checkbox;
    @FindBy(id = "user_companyName")
    WebElement billingCompanyName;
    @FindBy(id = "company_address1")
    WebElement billingAddress1;
    @FindBy(id = "company_address2")
    WebElement billingAddress2;
    @FindBy(id = "company_town")
    WebElement billingTown;
    @FindBy(id = "company_county")
    WebElement billingCounty;
    @FindBy(id = "company_post_code")
    WebElement billingPostCode;
    @FindBy(id = "stepOneProceed")
    WebElement proceedButton;
    @FindBy(id = "user_fullName")
    WebElement fullName;
    @FindBy(id = "user_email")
    WebElement email;
    @FindBy(id = "user_phoneNumber")
    WebElement phoneNumber;
    @FindBy(id = "place_pass_custom")
    WebElement password;
    @FindBy(xpath = "//*[@id='user_companyPosition_chosen']/a")
    WebElement yourPosition;
    @FindBy(xpath = "//*[@id='user_howDidYouKnow_chosen']/a")
    WebElement howDidYouFindUs;
    @FindBy(xpath = "//input[@id='user_termscondition']")
    WebElement terms;
    @FindBy(xpath = "//input[@id='user_receiveNewsletter']")
    WebElement receiveNewsletter;
    @FindBy(xpath = "//*[@class='recaptcha-checkbox-checkmark']")
    WebElement captcha;
    @FindBy(id = "stepTwoGetAdvice")
    WebElement goToBasketButton;


    public SignUpAccessPage(WebDriver driver)  {
        super(driver);
    }

    public void accessButton(){ this.accessButton.click();}

    public void accessLink(){this.accessLink.click();}

    public void companyType(){
        this.companyType.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='company_type_chosen']/div"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='company_type_chosen']/div/ul/li[2]")).click();
    }

    public void signUpAccessCredentials(){
        this.companyName.sendKeys(companyNameData);
        this.address1.sendKeys(address1Data);
        this.address2.sendKeys(address2Data);
        this.city.sendKeys(cityData);
        this.county.sendKeys(countyData);
        this.postCode.sendKeys(postCodeData);

    }

    public void companySector(){
        this.companySector.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='user_companySector_chosen']/div/ul"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='user_companySector_chosen']/div/ul/li[4]")).click();
    }

    public void companySize(){
        this.companySize.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='user_companySize_chosen']/div/ul"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='user_companySize_chosen']/div/ul/li[5]")).click();
    }

    public void checkbox(){
        this.checkbox.click();
    }

    public void signUpAccessCredentialsBilling() {
        this.billingCompanyName.sendKeys(billingCompanyNameData);
        this.billingAddress1.sendKeys(address1Data);
        this.billingAddress2.sendKeys(address2Data);
        this.billingTown.sendKeys(cityData);
        this.billingCounty.sendKeys(countyData);
        this.billingPostCode.sendKeys(postCodeData);
    }



    public void proceedButton(){
        this.proceedButton.click();
    }

    public void signUpAccessCredentialsDetails(){
        this.fullName.sendKeys(fullNameData);
        this.email.sendKeys(emailData);
        this.phoneNumber.sendKeys(phoneNumberData);
        this.password.sendKeys(passwordData);

    }

    public void yourPosition(){
        this.yourPosition.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='user_companyPosition_chosen']/div/ul"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='user_companyPosition_chosen']/div/ul/li[2]")).click();
    }

    public void howDidYouFindUs(){
        this.howDidYouFindUs.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='user_howDidYouKnow_chosen']/div/ul"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='user_howDidYouKnow_chosen']/div/ul/li[2]")).click();

    }

    public void terms(){
        this.terms.click();
    }

    public void receiveNewsletter(){
        this.receiveNewsletter.click();
    }

    public void captcha(){
        this.captcha.click();
    }

    public void goToBasketButton(){
        this.goToBasketButton.click();
    }

}
