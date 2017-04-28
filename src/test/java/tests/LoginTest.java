package tests;


import common.Driver;
import org.openqa.selenium.*;
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
    String validationmail =

    @BeforeTest
    public void openBrowser() {
        webDriver = driver.getDriver();
        loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test()
    public void LoginWithEmptyFields() {
        loginPage.ClickOnLoginButton();
        loginPage.LoginCredentials("email", "pass");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
       }
        loginPage.submit();
        Assert.assertEquals(validationmail,"Username Required");
        Assert.assertEquals(validationpass,"Password Required");
    }

}


//
//        driver.findElement(By.id("btn_submit")).click();
////		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//        Assert.assertEquals(validationmail,"Username Required");
//        Assert.assertEquals(validationpass,"Password Required");

//
//	@Test
//	public void LoginWithInvalidCredentials() {
//		driver.findElement(By.id("username")).sendKeys( "user");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.id("btn_submit")).click();
//		Assert.assertEquals(true, validation.contains("Email not registered – try again or create an account"));
//	}
//	@Test()
//	public void LoginWithValidCredentials(){
//		driver.findElement(By.id("username")).sendKeys("access@mailinator.com");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.id("btn_submit")).click();
//		Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='loggedIn']")).getText().contains("Access"));
//	}
//	@Test
//	public void Logout(){
//		action.moveToElement(element).build().perform();
//		driver.findElement(By.linkText("Log Out")).click();
//		Assert.assertEquals(true, driver.findElement(By.id("topNavLogin")).getText().contains("Login"));
//	}
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



