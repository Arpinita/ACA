package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends Base {
    Actions actions = new Actions(driver);

    @FindBy(id = "topNavLogin")
    public WebElement LoginButton;
    @FindBy(id = "username")
    private WebElement Email;
    @FindBy(id = "password")
    private WebElement Password;
    @FindBy(id = "btn_submit")
    private WebElement SignInButton;
    @FindBy(xpath = "//span[contains(.,'Username Required')]")
    private WebElement validationmail;
    @FindBy(xpath = "//span[contains(.,'Password Required')]")
    private WebElement validationpass;
    @FindBy(xpath = "//span[contains(.,'Email not registered – try again or create an account')]")
    private WebElement mainvalidation;
    @FindBy(xpath = "//a[@class='loggedIn firepath-matching-node']")
    private WebElement username;
    @FindBy(linkText = "Log Out")
    private WebElement LogOut;

    public LoginPage(WebDriver driver)  {
        super(driver);
    }

    public void ClickOnLoginButton(){
        this.LoginButton.click();
    }

    public void LoginCredentials(String Email, String Password)  {
        this.Email.clear();
        this.Email.sendKeys(Email);
        this.Password.clear();
        this.Password.sendKeys(Password);

    }

    public boolean Validationmail (){
        return this.validationmail.isDisplayed();

    }

    public  boolean Validationpass(){
        return this.validationpass.isDisplayed();
    }

    public boolean Mainvalidation(){
        return this.mainvalidation.isDisplayed();
    }

    public boolean Username(){return this.username.isDisplayed();}

    public void LogOut(){
        actions.moveToElement(LogOut).build().perform();
        this.LogOut.click();
    }

    public ReceiptPage submit(){
        SignInButton.click();
        return new ReceiptPage(driver);

    }


}
