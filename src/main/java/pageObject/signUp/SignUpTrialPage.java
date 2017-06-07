package pageObject.signUp;

import common.Inputs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;


/**
 * Created by Arpine on 5/9/2017.
 */
public class SignUpTrialPage extends Base {

        Inputs inputs = new Inputs();
        Actions actions = new Actions(driver);

        @FindBy(xpath = "//*[@id='free_trial_popup_link']")
        WebElement freeTrialPopUpLink;
        @FindBy(id = "fancybox-content")
        WebElement freeTrialPopUp;
        @FindBy(id = "user_freetrial_fullName")
        WebElement freeTrialFullName;
        @FindBy(id = "user_freetrial_email")
        WebElement freeTrialEmail;
        @FindBy(id = "user_freetrial_phoneNumber")
        WebElement freeTrialPhoneNumber;
        @FindBy(id = "user_freetrial_password")
        WebElement freeTrialPassword;
        @FindBy(xpath = "//*[@id='company_details_how_did_you_know_chosen']/a")
        WebElement howDidYouFindUs;
        @FindBy(xpath = "//*[@id='user_job_title_chosen']/a")
        WebElement yourPosition;
        @FindBy(xpath = "//*[@id='company_details_type_chosen']/a")
        WebElement companyType;
        @FindBy(id = "company_details_contracting_party")
        WebElement companyName;
        @FindBy(xpath = "//*[@id='user_freetrial_companySector_chosen']/a")
        WebElement companySector;
        @FindBy(xpath = "//*[@id='user_freetrial_companySize_chosen']/a")
        WebElement companySize;
        @FindBy(xpath = "//*[@id='user_freetrial_termscondition']")
        WebElement terms;
        @FindBy(xpath = "//*[@id='user_freetrial_receiveNewsletter']")
        WebElement receiveNewsletter;
        @FindBy(xpath = "//*[@id='recaptcha-anchor']/div[5]")
        WebElement captcha;
        @FindBy(id = "freetrial_stepTwoGetAdviceFreeTrial")
        WebElement signUpButton;

    public SignUpTrialPage(WebDriver driver)  {
        super(driver);
    }

    public void freeTrialPopUpLink(){
        this.freeTrialPopUpLink.click();
    }

    public boolean freeTrialPopUp(){
        return this.freeTrialPopUp.isDisplayed();
    }

    public void howDidYouFindUs(){
        this.howDidYouFindUs.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='company_details_how_did_you_know_chosen']/div/ul"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='company_details_how_did_you_know_chosen']/div/ul/li[3]")).click();

    }

    public void yourPosition(){
        this.yourPosition.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='user_job_title_chosen']/div/ul"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='user_job_title_chosen']/div/ul/li[2]")).click();
    }

    public void companyType(){
        this.companyType.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='company_details_type_chosen']/div"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='company_details_type_chosen']/div/ul/li[2]")).click();
    }

    public void companySector(){
        this.companySector.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='user_freetrial_companySector_chosen']/div"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='user_freetrial_companySector_chosen']/div/ul/li[2]")).click();
    }

    public void companySize(){
        this.companySize.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='user_freetrial_companySize_chosen']/div"))).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id='user_freetrial_companySize_chosen']/div/ul/li[4]")).click();
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

    public void signUpButton(){
        this.signUpButton.click();
    }

        public void signUpTrialCredentials(){
            this.freeTrialFullName.sendKeys(inputs.randomAtoZ(), inputs.randomAtoZ());
            this.freeTrialEmail.sendKeys("test" + inputs.randomNumber() +"@mailinator.com");
            this.freeTrialPhoneNumber.sendKeys(inputs.randomNumber());
            this.freeTrialPassword.sendKeys(inputs.randomNumber());
            this.companyName.sendKeys("test");


        }

    }

