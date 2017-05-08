package tests;

import common.Driver;
import org.junit.Ignore;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.SignUpPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Arpine on 5/8/2017.
 */
public class SignUp {
    public WebDriver webDriver;
    public SignUpPage signUpPage;


    @BeforeClass
    public void openBrowser() {
        Driver driver = new Driver();
        webDriver = driver.getDriver();
        System.out.print(webDriver);
        webDriver.manage().window().maximize();
        signUpPage = new SignUpPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeBrowser(){
        webDriver.close();
        webDriver.quit();
    }

    @Test()
    public void emptyFields(){
        signUpPage.clickOnSignUpButton();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        Assert.assertEquals(signUpPage.signUpPopUp(),true);
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript("window.scrollBy(0,250)", "");
        signUpPage.createAccountButton();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        Assert.assertEquals(signUpPage.validationFirstName(), true);
        Assert.assertEquals(signUpPage.validationLastName(), true);
        Assert.assertEquals(signUpPage.validationEmail(), true);
        Assert.assertEquals(signUpPage.validationPassword(), true);
        Assert.assertEquals(signUpPage.passwordsDoNotMatch(), true);
        Assert.assertEquals(signUpPage.validationTerms(), true);
        Assert.assertEquals(signUpPage.captchaIsRequired(), true);
    }

    @Ignore
    @Test()
    public void signUp(){
        signUpPage.signUpCredentials("Test","Test","test@mailinator.com","123456","123456");


    }
}
