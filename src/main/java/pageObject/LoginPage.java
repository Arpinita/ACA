package pageObject;


import common.UserInputs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends Base {
    Actions actions = new Actions(driver);
    public UserInputs userInputs;


    @FindBy(xpath = "//button[@id='topNavLogin']")
    WebElement loginButton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "btn_submit")
    WebElement signInButton;
    @FindBy(xpath = "//span[contains(.,'Username Required')]")
    WebElement validationmail;
    @FindBy(xpath = "//span[contains(.,'Password Required')]")
    WebElement validationpass;
    @FindBy(xpath = "//span[contains(.,'Email not registered – try again or create an account')]")
    WebElement mainvalidation;
    @FindBy(xpath = "//*[@id='container']/div[2]/div[1]/div/div[3]/div[1]")
    WebElement username;
    @FindBy(xpath = "//a[contains(text(), 'Sign out')]")
    WebElement signOut;
    @FindBy(xpath = "//div[@id='fancybox-content']")
    WebElement loginPopUp;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton() {
        this.loginButton.click();
    }

    public void loginCredentials(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);

    }

    public boolean validationmail() {
        return driver.findElement(By.xpath("//span[contains(.,'Username Required')]")).getText().contains("Username Required");

    }

    public boolean validationpass() {
        return driver.findElement(By.xpath("//span[contains(.,'Password Required')]")).getText().contains("Password Required");

    }

    public boolean loginPopUp() {
        return loginPopUp.isDisplayed();
    }

    public boolean isEmailNotCorretMessagePresent() {
        return this.mainvalidation.isDisplayed();
    }

    public boolean loginButtonPresent() {
        return loginButton.isDisplayed();
    }

    public boolean username() {
        return this.username.isDisplayed();
    }

    public void logOut() {
       // actions.moveToElement(accessDropDown).build().perform();
       // actions.moveToElement(si).build().perform();
        this.signOut.click();
    }


    public void signInButton() {
        this.signInButton.click();
         }


}
