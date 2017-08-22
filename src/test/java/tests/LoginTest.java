package tests;


import config.Driver;
import common.UserInputs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


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
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        loginPage.signInButton();
        Assert.assertEquals(loginPage.validationmail(), true);
        Assert.assertEquals(loginPage.validationpass(), true);
    }


    @Test()
    public void loginWithInvalidCredentials() {
        loginPage.clickOnLoginButton();
        loginPage.loginCredentials("test@gmail.com", "123456");
        loginPage.signInButton();
        Assert.assertTrue(loginPage.isEmailNotCorretMessagePresent());

    }

    @Test()
    public void loginWithValidCredentials() {
        loginPage.clickOnLoginButton();
        loginPage.loginCredentials("access@mailinator.com", "123456");
        loginPage.signInButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(loginPage.username(), "Access STDev");
    }

    @Test
    public void logout() {
        loginPage.clickOnLoginButton();
        loginPage.loginCredentials("access@mailinator.com", "123456");
        loginPage.signInButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(loginPage.username(), "Access STDev");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement scr1 = webDriver.findElement(By.xpath("//*[@id='container']/div[2]/div[1]"));
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scr1);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.xpath("//*[@id='container']/div[2]/div[1]/div/div[4]/ul/li[7]/a")).click();
        Assert.assertTrue(loginPage.loginButtonPresent(), "Login");
    }
}



