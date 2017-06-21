package tests;

import common.Enquiry;
import common.Inputs;
import config.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import pageObject.LoginPage;

import javax.swing.*;

import static config.TAGS.*;

/**
 * Created by Arpine on 6/8/2017.
 */
public class CreateEnquiry {
    public WebDriver webDriver;
    public LoginPage loginPage;
    private String email;
    private String password;
    public Enquiry enquiry;



    @BeforeMethod
    public void openBrowser() {
        Driver driver = new Driver();
        webDriver = driver.getDriver();
        System.out.print(webDriver);
        webDriver.manage().window().maximize();
        loginPage = new LoginPage(webDriver);
        Enquiry enquiry = new Enquiry();
    }

    @AfterMethod
    public void closeBrowser() {
        webDriver.close();
        webDriver.quit();
    }

    @Test()
    public void createEnquiry() throws InterruptedException {
        loginPage.clickOnLoginButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.loginPopUp();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.login(ACCESS);
        loginPage.loginCredentials(this.email, this.password);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.signInButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(loginPage.username(), true);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.xpath("//a[@href='/legal-enquiry']")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("//*[@id='fancybox-content']")).isDisplayed();
        webDriver.findElement(By.xpath("//*[@id='category']")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("//option[@value='20']")).click();
        Thread.sleep(3000);
        enquiry.caseSubject();
        enquiry.caseDescription();
        enquiry.sendButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Alert confirmationAlert = webDriver.switchTo().alert();
        String alertText = confirmationAlert.getText();
        System.out.println("Alert text is " + alertText);
        confirmationAlert.accept();

    }


    public void login(int type) {
        switch (type) {
            case ADMIN:
                email = "arpine.stdev@gmail.com";
                password = "Qwerty1234";
                break;
            case LAWYER:
                loginPage.email.sendKeys("lawyer@mailinator.com");
                loginPage.password.sendKeys("123456");
                break;
            case ACCESS:
                email = "access@mailinator.com";
                password = "123456";
                break;
            case GROWTH:
                loginPage.email.sendKeys("growth@mailinator.com");
                loginPage.password.sendKeys("123456");
                break;
            case PROTECT:
                loginPage.email.sendKeys("protect@mailinator.com");
                loginPage.password.sendKeys("123456");
                break;
            case USER_TRIAL:
                loginPage.email.sendKeys("test_trial@mailinator.com");
                loginPage.password.sendKeys("123456");
                break;
            case USER_REG:
                loginPage.email.sendKeys("test_reg@mailinator.com");
                loginPage.password.sendKeys("123456");
                break;
        }
    }
}


