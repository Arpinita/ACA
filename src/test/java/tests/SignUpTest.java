package tests;

import config.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObject.LoginPage;
import pageObject.signUp.SignUpSubscriptionPage;
import pageObject.signUp.SignUpPage;
import pageObject.signUp.SignUpTrialPage;
import java.util.concurrent.TimeUnit;
import common.Inputs;


/**
 * Created by Arpine on 5/8/2017.
 */
public class SignUpTest {
    public WebDriver webDriver;
    public SignUpPage signUpPage;
    public SignUpTrialPage signUpTrial;
    public SignUpSubscriptionPage signUpSubscription;
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
        signUpSubscription = new SignUpSubscriptionPage(webDriver);
        loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
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


    @Test()
    public void signUp(){
        signUpPage.clickOnSignUpButton();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        signUpPage.signUpCredentials();
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,300);");
        signUpPage.captchaCheckmark();
        signUpPage.createAccountButton();
        Assert.assertEquals(loginPage.username(), true);
}

     @Test()
    public void signUpAsTrial(){
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
        signUpPage.pricingDropDown();
         ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,350);");
        signUpPage.trial();
        signUpTrial.freeTrialPopUpLink();
        Assert.assertEquals(signUpTrial.freeTrialPopUp(), true);
        signUpTrial.signUpTrialCredentials();
        signUpTrial.howDidYouFindUs();
        signUpTrial.yourPosition();
        signUpTrial.companyType();
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,450);");
        signUpTrial.companySector();
        signUpTrial.companySize();

        signUpTrial.terms();
        signUpTrial.receiveNewsletter();

        signUpTrial.captcha();
        signUpTrial.signUpButton();
        Assert.assertEquals(loginPage.username(), true);
   }

   @Test()
    public void signUpAsAccessWithoutBilling(){
       signUpPage.pricingDropDown();
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,400);");
       signUpSubscription.accessButton();
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       signUpSubscription.subscriptionLink();
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       signUpSubscription.companyType();
       signUpSubscription.signUpSubscriptionCredentials();
       ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,1500);");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       signUpSubscription.companySector();
       signUpSubscription.companySize();
       signUpSubscription.checkbox();
       signUpSubscription.proceedButton();
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,650);");
       signUpSubscription.signUpSubscriptionCredentialsDetails();
       signUpSubscription.yourPosition();
       signUpSubscription.howDidYouFindUs();
       signUpSubscription.terms();
       signUpSubscription.receiveNewsletter();
       signUpSubscription.captcha();
       signUpSubscription.goToBasketButton();
       Assert.assertEquals(loginPage.username(), true);
   }

   @Test()
    public void signUpAsAccessWithBilling(){
       signUpPage.pricingDropDown();
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,400);");
       signUpSubscription.accessButton();
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       signUpSubscription.subscriptionLink();
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       signUpSubscription.companyType();
       signUpSubscription.signUpSubscriptionCredentials();
       ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,1500);");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       signUpSubscription.companySector();
       signUpSubscription.companySize();
       signUpSubscription.signUpSubscriptionCredentialsBilling();
       signUpSubscription.proceedButton();
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
       ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,650);");
       signUpSubscription.signUpSubscriptionCredentialsDetails();
       signUpSubscription.yourPosition();
       signUpSubscription.howDidYouFindUs();
       signUpSubscription.terms();
       signUpSubscription.receiveNewsletter();
       signUpSubscription.captcha();
       signUpSubscription.goToBasketButton();
       Assert.assertEquals(loginPage.username(), true);
    }

    @Test()
    public void signUpAsGrowthWithoutBilling(){
        signUpPage.pricingDropDown();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,400);");
        signUpSubscription.growthButton();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.subscriptionLink();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.companyType();
        signUpSubscription.signUpSubscriptionCredentials();
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,1500);");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.companySector();
        signUpSubscription.companySize();
        signUpSubscription.checkbox();
        signUpSubscription.proceedButton();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,600);");
        signUpSubscription.signUpSubscriptionCredentialsDetails();
        signUpSubscription.yourPosition();
        signUpSubscription.howDidYouFindUs();
        signUpSubscription.terms();
        signUpSubscription.receiveNewsletter();
        signUpSubscription.captcha();
        signUpSubscription.goToBasketButton();
        Assert.assertEquals(loginPage.username(), true);

    }

    @Test()
    public void signUpAsGrowthWithBilling(){
        signUpPage.pricingDropDown();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,400);");
        signUpSubscription.growthButton();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.subscriptionLink();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.companyType();
        signUpSubscription.signUpSubscriptionCredentials();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,1500);");
        signUpSubscription.companySector();
        signUpSubscription.companySize();
        signUpSubscription.signUpSubscriptionCredentialsBilling();
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,2000);");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.proceedButton();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,650);");
        signUpSubscription.signUpSubscriptionCredentialsDetails();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.yourPosition();
        signUpSubscription.howDidYouFindUs();
        signUpSubscription.terms();
        signUpSubscription.receiveNewsletter();
        signUpSubscription.captcha();
        signUpSubscription.goToBasketButton();
        Assert.assertEquals(loginPage.username(), true);
    }

    @Test()
    public void signUpAsProtectWithoutBilling(){
        signUpPage.pricingDropDown();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,400);");
        signUpSubscription.protectButton();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.subscriptionLink();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.companyType();
        signUpSubscription.signUpSubscriptionCredentials();
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,1500);");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.companySector();
        signUpSubscription.companySize();
        signUpSubscription.signUpSubscriptionCredentialsBilling();
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,2000);");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.proceedButton();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.signUpSubscriptionCredentialsDetails();
        signUpSubscription.yourPosition();
        signUpSubscription.howDidYouFindUs();
        signUpSubscription.terms();
        signUpSubscription.receiveNewsletter();
        signUpSubscription.captcha();
        signUpSubscription.goToBasketButton();
        Assert.assertEquals(loginPage.username(), true);
    }

    @Test()
    public void signUpAsProtectWithBilling(){
        signUpPage.pricingDropDown();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,400);");
        signUpSubscription.protectButton();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.subscriptionLink();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.companyType();
        signUpSubscription.signUpSubscriptionCredentials();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,1500);");
        signUpSubscription.companySector();
        signUpSubscription.companySize();
        signUpSubscription.signUpSubscriptionCredentialsBilling();
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,2000);");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.proceedButton();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        ((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0,650);");
        signUpSubscription.signUpSubscriptionCredentialsDetails();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        signUpSubscription.yourPosition();
        signUpSubscription.howDidYouFindUs();
        signUpSubscription.terms();
        signUpSubscription.receiveNewsletter();
        signUpSubscription.captcha();
        signUpSubscription.goToBasketButton();
        Assert.assertEquals(loginPage.username(), true);
    }

}
