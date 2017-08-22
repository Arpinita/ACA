package tests;


import config.Driver;
import core.GetLegalAdvicePopUp;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import pageObject.LoginPage;
import pageObject.user.myLegalEnquiries.EnterNewLegalEnquiry;

import static config.TAGS.*;


public class CreateEnquiry {
    public WebDriver webDriver;
    public LoginPage loginPage;
    private String email;
    private String password;
    public EnterNewLegalEnquiry enterNewLegalEnquiryXpaths ;


    @BeforeMethod
    public void openBrowser() {
        Driver driver = new Driver();
        webDriver = driver.getDriver();
        System.out.print(webDriver);
        webDriver.manage().window().maximize();
        loginPage = new LoginPage(webDriver);
        //Enquiry enquiry = new Enquiry();

    }

    @AfterMethod
    public void closeBrowser() {
        webDriver.close();
        webDriver.quit();
    }

    @Test()
    public void createEnquiry() throws InterruptedException {
        loginPage.clickOnLoginButton();
        Thread.sleep(5000);
        loginPage.loginPopUp();
        Thread.sleep(5000);
        this.login(ACCESS);
        loginPage.loginCredentials(this.email, this.password);
        Thread.sleep(5000);
        loginPage.signInButton();
        Thread.sleep(7000);
        webDriver.findElement(By.xpath("//a[@class='popup']")).click();
        Thread.sleep(7000);
        webDriver.findElement(By.xpath("//div[@class='widget']")).isDisplayed();
        webDriver.findElement(By.xpath("//*[@id='category']")).click();
        Thread.sleep(5000);

        enterNewLegalEnquiryXpaths = new EnterNewLegalEnquiry(
                "//*[@id='category']",
                "//*[@id='case_subject']",
                "//*[@id='case_description']",
                "//*[@id='linkLawbiteDoc']",
                "//button[contains(@type,'button')]",
                "//a[@id='sendbtn']"
                );

        GetLegalAdvicePopUp getLegalAdvicePopUp = new GetLegalAdvicePopUp(webDriver, enterNewLegalEnquiryXpaths);

        getLegalAdvicePopUp.selectRandomFromDropdownList();
        Thread.sleep(5000);
        getLegalAdvicePopUp.setSubjectValue();
        Thread.sleep(5000);
        getLegalAdvicePopUp.setDescriptionValue();
        Thread.sleep(5000);



//        Alert confirmationAlert = webDriver.switchTo().alert();
//        String alertText = confirmationAlert.getText();
//        System.out.println("Alert text is " + alertText);
//        confirmationAlert.accept();

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


