package tests;


import common.Driver;
import common.UserInputs;
import common.Users;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class LoginTest {
    public Driver driver = new Driver();
    public WebDriver webDriver;
    public LoginPage loginPage;
    public Users users;
   // Users.UserCredentials(String type);




    @BeforeTest
    public void openBrowser() {

        webDriver = driver.getDriver();
        loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test()
    public void LoginWithEmptyFields() {
        loginPage.ClickOnLoginButton();
        users.UserCredentialsAdmin()
        loginPage.LoginCredentials("Email", "password");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.submit();
        Assert.assertEquals(loginPage.Validationmail(), "Username Required");
        Assert.assertEquals(loginPage.Validationpass(), "Password Required");
    }


    @Test()
    public void LoginWithInvalidCredentials() {
        loginPage.ClickOnLoginButton();
        loginPage.LoginCredentials("user", "123456");
        loginPage.submit();
        Assert.assertEquals(loginPage.Mainvalidation(), "Email not registered – try again or create an account");

    }

    @Test()
    public void LoginWithValidCredentials() {
        loginPage.ClickOnLoginButton();
        loginPage.LoginCredentials("email","password");
        loginPage.submit();
        Assert.assertEquals(loginPage.Username(), "Access");
    }

    @Test
    public void Logout() {
        loginPage.ClickOnLoginButton();
        loginPage.LoginCredentials(users.UserCredentials("access"), users.UserCredentials("password"));
        loginPage.submit();
        Assert.assertEquals(loginPage.Username(), "Access");
        loginPage.LogOut();
        Assert.assertEquals(loginPage.LoginButton, "Login");
    }
}
//	@Test
//	public void SignUp(){
//		driver.findElement(By.id("topNavRegister")).click();
//		Assert.assertEquals(true, driver.findElement(By.id("fancybox-content")).isDisplayed());
//		driver.findElement(By.id("user_firstname")).sendKeys("Name");
//		driver.findElement(By.id("user_lastname")).sendKeys("Surname");
//		driver.findElement(By.id("user_email")).sendKeys("test1304@mailinator.com");
//		driver.findElement(By.id("user_password")).sendKeys("123456");
//		driver.findElement(By.id("user_confirm_password")).sendKeys("123456");
//		driver.findElement(By.id("condition")).click();
//		driver.findElement(By.id("checkbox2")).click();
//
//		driver.findElement(By.id("accountbtn")).click();
//	}
/*	@After
		driver.close();
		 driver.quit();*/



