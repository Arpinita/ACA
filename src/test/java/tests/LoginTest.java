package tests;


import common.Driver;
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


    @BeforeClass
    public void openBrowser() {
        Driver driver = new Driver();
        webDriver = driver.getDriver();
        System.out.print(webDriver);
        webDriver.manage().window().maximize();
        loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterClass
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
        loginPage.submit();
        Assert.assertEquals(loginPage.validationmail(), true);
        Assert.assertEquals(loginPage.validationpass(), true);
    }


    @Test()
    public void loginWithInvalidCredentials() {
        loginPage.loginCredentials("user@mail.com", "123456");
        loginPage.submit();
        Assert.assertTrue(loginPage.isEmailNotCorretMessagePresent(), "Email not registered – try again or create an account");

    }

    @Test()
    public void loginWithValidCredentials() {
        loginPage.loginCredentials("access@mailinator.com", "123456");
        loginPage.submit();
        Assert.assertTrue(loginPage.username(), "Access");
    }

    @Test
    public void logout() {
        Assert.assertTrue(loginPage.username(), "Access");
        loginPage.logOut();
        Assert.assertTrue(loginPage.loginButtonPresent(), "Login");
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



