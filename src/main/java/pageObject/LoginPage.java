package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Base {

//
//    final String LoginButton = "topNavLogin";
//    final String Email = "username";
//    final String username = "access@mailinator.com";
//    final String Password = "password";
//    final String password = "123456";
//    final String SignInButton = "btn_submit";



    @FindBy(id = "topNavLogin")
    private WebElement LoginButton;
    @FindBy(id = "username")
    private WebElement Email;
    @FindBy(id = "password")
    private WebElement Password;
    @FindBy(id = "btn_submit")
    private WebElement SignInButton;


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


    public ReceiptPage submit(){
        SignInButton.click();
        return new ReceiptPage(driver);

    }
}
