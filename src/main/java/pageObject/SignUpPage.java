package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Arpine on 5/8/2017.
 */
public class SignUpPage extends Base {
    Actions actions = new Actions(driver);
    @FindBy(xpath = "//button[@id='topNavRegister']")
    WebElement signUpButton;
    @FindBy(xpath = "//*[@id='fancybox-content']")
    WebElement signUpPopUp;
    @FindBy(id = "user_firstname")
    WebElement firstName;
    @FindBy(id = "user_lastname")
    WebElement lastName;
    @FindBy(id = "user_email")
    WebElement signUpEmail;
    @FindBy(id = "user_password")
    WebElement signUpPassword;
    @FindBy(id = "user_confirm_password")
    WebElement signUpConfirmPassword;
    @FindBy(id = "condition")
    WebElement condition;
    @FindBy(id = "checkbox2")
    WebElement checkbox2;
    @FindBy(xpath = "//*[@class='recaptcha-checkbox-checkmark']")
    WebElement captcha;
    @FindBy(xpath = "//input[@id='accountbtn']")
    WebElement createAccountButton;
    @FindBy(xpath = "//*[contains(text(), 'Firstname Required')]")
    WebElement validationFirstName;
    @FindBy(xpath = "//*[contains(text(), 'Surname Required')]")
    WebElement validationLastName;
    @FindBy(xpath = "//*[contains(text(), 'Email Required')]")
    WebElement validationEmail;
    @FindBy(xpath = "//*[contains(text(), 'Password Required')]")
    WebElement validationPassword;
    @FindBy(xpath = "//*[contains(text(), 'The passwords do not match')]")
    WebElement passwordsDoNotMatch;
    @FindBy(xpath = ".//*[@id='register_form']/div[6]/span")
    WebElement validationTerms;
    @FindBy(xpath = ".//*[@id='register_form']/div[8]/span")
    WebElement captchaIsRequired;
    @FindBy(xpath = "//*[@id='container']/div[1]/div[1]/div[1]/div/div/div[4]/ul/li[5]/a")     //"//a[contains(text(), 'Pricing')]")
    WebElement pricing;
    @FindBy(xpath = ".//*[@id='container']/div[1]/div[1]/div[1]/div/div/div[4]/ul/li[5]/div/ul/li[2]/a")        //"//a[contains(text(), 'Pricing Plans')]")
    WebElement pricingPlans;
    @FindBy(xpath = "//a[contains(text(), 'Try it free for a week!')]")
    WebElement trial;



    public SignUpPage(WebDriver driver)  {
        super(driver);
    }

    public void clickOnSignUpButton(){
        this.signUpButton.click();
    }

    public boolean signUpPopUp (){
        return this.signUpPopUp.isDisplayed();
    }

    public boolean validationFirstName(){
        return this.validationFirstName.isDisplayed();
    }

    public boolean validationLastName(){
        return this.validationLastName.isDisplayed();
    }

    public boolean validationEmail(){
        return this.validationEmail.isDisplayed();
    }

    public boolean validationPassword(){
        return this.validationPassword.isDisplayed();
    }

    public boolean passwordsDoNotMatch(){
        return this.passwordsDoNotMatch.isDisplayed();
    }

    public boolean validationTerms(){
        return this.validationTerms.isDisplayed();
    }

    public boolean captchaIsRequired(){
        return this.captchaIsRequired.isDisplayed();
    }

    public void pricingDropDown(){
        this.pricing.click();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div[1]/div[1]/div[1]/div/div/div[4]/ul/li[5]/div/ul"))).build().perform();
      // actions.moveToElement(pricing).build().perform();
        actions.moveToElement(pricingPlans).build().perform();
        this.pricingPlans.click();
    }

    public void trial(){
        this.trial.click();
    }

    public void signUpCredentials(String firstName, String lastName, String signUpEmail, String signUpPassword, String signUpConfirmPassword){
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.signUpEmail.sendKeys(signUpEmail);
        this.signUpPassword.sendKeys(signUpPassword);
        this.signUpConfirmPassword.sendKeys(signUpConfirmPassword);
        this.condition.click();
        this.checkbox2.click();
    }

    public void createAccountButton(){
        this.createAccountButton.click();
    }



}
