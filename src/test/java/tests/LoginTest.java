package tests;


import config.Driver;
import common.UserInputs;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class LoginTest {

    public WebDriver webDriver;
    public LoginPage loginPage;
    public UserInputs userInputs;


    @BeforeMethod
    public void openBrowser() {
        Driver driver = new Driver();
        webDriver = driver.getDriver();
        System.out.print(webDriver);
        webDriver.manage().window().maximize();
        loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void closeBrowser() {
        webDriver.close();
        webDriver.quit();
    }

    @Test()
    public void loginWithEmptyFields() {

        loginPage.clickOnLoginButton();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        loginPage.signInButton();
        Assert.assertEquals(loginPage.validationmail(), true);
        Assert.assertEquals(loginPage.validationpass(), true);
    }


    @Test()
    public void loginWithInvalidCredentials() {
        loginPage.loginCredentials("test@gmail.com", "123456");
        loginPage.signInButton();
        Assert.assertTrue(loginPage.isEmailNotCorretMessagePresent(), "Email not registered – try again or create an account");

    }

    @Test()
    public void loginWithValidCredentials() {
        loginPage.loginCredentials("access@mailinator.com", "123456");
        loginPage.signInButton();
        Assert.assertTrue(loginPage.username(), "Access");
    }

    @Test
    public void logout() {
        Assert.assertTrue(loginPage.username(), "Access");
        loginPage.logOut();
        Assert.assertTrue(loginPage.loginButtonPresent(), "Login");
    }
}



