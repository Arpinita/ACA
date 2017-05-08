package pageObject;


import common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import common.Driver.*;

public class LoginPage extends Base {
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//button[@id='topNavLogin']")
    WebElement loginButton;
    @FindBy(xpath = "//input[@id='username']")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "btn_submit")
    WebElement signInButton;
    @FindBy(xpath = "//span[contains(.,'Username Required')]")
    WebElement validationmail;
    @FindBy(xpath = "//span[contains(.,'Password Required')]")
    WebElement validationpass;
    @FindBy(xpath = "//span[contains(.,'Email not registered – try again or create an account')]")
    WebElement mainvalidation;
    @FindBy(xpath = "//a[@class='loggedIn']")
    WebElement username;
    @FindBy(xpath="//*[@class='menu loggedIn']")
    WebElement accessDropDown;
    @FindBy(xpath = "//*[contains(text(), 'Log Out')]")
    WebElement logOut;
    @FindBy(xpath = "template_container_login")
    WebElement loginPopUp;

    public LoginPage(WebDriver driver)  {
        super(driver);
    }

    public void clickOnLoginButton(){
        this.loginButton.click();
        //return LoginPopUp;
    }

    public void loginCredentials(String email, String password)  {
        this.email.clear();
        this.email.sendKeys(email);
        this.password.clear();
        this.password.sendKeys(password);

    }

    public boolean validationmail (){
        return driver.findElement(By.xpath("//span[contains(.,'Username Required')]")).getText().contains("Username Required");

    }

    public  boolean validationpass(){
        return driver.findElement(By.xpath("//span[contains(.,'Password Required')]")).getText().contains("Password Required");

    }

    public boolean isEmailNotCorretMessagePresent(){
        return this.mainvalidation.isDisplayed();
    }

    public boolean loginButtonPresent(){
       return loginButton.isDisplayed();
    }

    public boolean username(){return this.username.isDisplayed();}

    public void logOut(){
        actions.moveToElement(accessDropDown).build().perform();
        actions.moveToElement(logOut).build().perform();
        this.logOut.click();
    }


    public ReceiptPage submit(){
        signInButton.click();
        return new ReceiptPage(driver);

    }


}
