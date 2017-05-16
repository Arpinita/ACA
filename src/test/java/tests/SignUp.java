package tests;

import common.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObject.LoginPage;
import pageObject.signUp.SignUpAccessPage;
import pageObject.signUp.SignUpPage;
import pageObject.signUp.SignUpTrialPage;
import java.util.concurrent.TimeUnit;
import common.Inputs;


/**
 * Created by Arpine on 5/8/2017.
 */
public class SignUp {
    public WebDriver webDriver;
    public SignUpPage signUpPage;
    public SignUpTrialPage signUpTrial;
    public SignUpAccessPage signUpAccess;
    public LoginPage loginPage;
    Inputs inputs = new Inputs();
    JavascriptExecutor jse = (JavascriptExecutor)webDriver;


    @BeforeMethod
    public void openBrowser() {
        Driver driver = new Driver();
        webDriver = driver.getDriver();
        System.out.print(webDriver);
        webDriver.manage().window().maximize();
        signUpPage = new SignUpPage(webDriver);
        signUpTrial = new SignUpTrialPage(webDriver);
        signUpAccess = new SignUpAccessPage(webDriver);
        loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser(){
        webDriver.close();
        webDriver.quit();
    }

  /* @Test()
    public void emptyFields(){
        signUpPage.clickOnSignUpButton();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        Assert.assertEquals(signUpPage.signUpPopUp(),true);
       ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,300);");
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
*/

    @Test()
    public void signUp(){
        signUpPage.clickOnSignUpButton();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        signUpPage.signUpCredentials();
        jse.executeScript("window.scrollBy(0,300)", "");
        signUpPage.captchaIsRequired();
        signUpPage.createAccountButton();
        Assert.assertEquals(loginPage.username(), true);

    }

    /* @Test()
    public void signUpAsTrial(){
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
        signUpPage.pricingDropDown();
        jse.executeScript("window.scrollBy(0,300)", "");
        signUpPage.trial();
        signUpTrial.freeTrialPopUpLink();
        Assert.assertEquals(signUpTrial.freeTrialPopUp(), true);
        signUpTrial.signUpTrialCredentials();
        signUpTrial.howDidYouFindUs();
        signUpTrial.yourPosition();
        signUpTrial.companyType();
        signUpTrial.companySector();
        signUpTrial.companySize();
        signUpTrial.termscondition();
        signUpTrial.receiveNewsletter();
        jse.executeScript("window.scrollBy(0,250)", "");
        signUpTrial.captcha();
        signUpTrial.signUpButton();
        Assert.assertEquals(loginPage.username(), true);
   }

   @Test()
    public void signUpAsAccessWithoutBilling(){
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       signUpPage.pricingDropDown();
       jse.executeScript("window.scrollBy(0,300)", "");
       signUpAccess.accessButton();
       signUpAccess.accessLink();
       signUpAccess.companyType();
       signUpAccess.signUpAccessCredentials();
       signUpAccess.companySector();
       signUpAccess.companySize();
       signUpAccess.checkbox();
       signUpAccess.proceedButton();
       signUpAccess.yourPosition();
       signUpAccess.howDidYouFindUs();
       signUpAccess.terms();
       signUpAccess.receiveNewsletter();
       signUpAccess.captcha();
       signUpAccess.goToBasketButton();
       Assert.assertEquals(loginPage.username(), true);
   }

   @Test()
    public void signUpAsWithBilling(){
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       signUpPage.pricingDropDown();
       jse.executeScript("window.scrollBy(0,300)", "");
       signUpAccess.accessButton();
       signUpAccess.accessLink();
       signUpAccess.companyType();
       signUpAccess.signUpAccessCredentials();
       signUpAccess.companySector();
       signUpAccess.companySize();
       signUpAccess.signUpAccessCredentialsBilling();
       signUpAccess.proceedButton();
       signUpAccess.signUpAccessCredentialsDetails();
       signUpAccess.yourPosition();
       signUpAccess.howDidYouFindUs();
       signUpAccess.terms();
       signUpAccess.receiveNewsletter();
       signUpAccess.captcha();
       signUpAccess.goToBasketButton();
       Assert.assertEquals(loginPage.username(), true);
    }*/
}
