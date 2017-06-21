package common;

import config.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

/**
 * Created by Arpine on 6/13/2017.
 */
public class Enquiry {
    public WebDriver driver;
    public Inputs inputs;
    public Popup newWin;
//    Actions actions = new Actions(driver);

    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement clientCareAlert;
    @FindBy(xpath = "//a[@class='popup']")
    WebElement newLegalEnquiry;
    @FindBy(xpath = "//div[@id='fancybox-content']")
    WebElement enquiryPopUp;
    @FindBy(id = "category")
    WebElement legalCategory;
    @FindBy(id = "case_subject")
    WebElement caseSubject;
    @FindBy(id = "case_description")
    WebElement caseDescription;
    @FindBy(id = "linkLawbiteDoc")
    WebElement linkLawbiteDoc;
    @FindBy(id = "sendbtn")
    WebElement sendButton;


//    public void clientCareAlert(){
////        actions.moveToElement(driver.findElement(By.xpath("//div[@class='preemtive-chat agent_text_button']"))).build().perform();
////        actions.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-times']"))).build().perform();
////        this.clientCareAlert.click();
//    }

//    public void createEnquiry(){
//        Driver driver = new Driver();
//        WebDriver a = driver.getDriver();
////        this.newLegalEnquiry.click();
       // a.findElement(By.xpath(".//*[@id='container']/div[2]/div/div/div/div[2]/div[4]/div/ul/li[1]/a")).click();
//    }

    public boolean enquiryPopUp() {
        return  enquiryPopUp.isDisplayed();
    }

    public void chooseFromDropDown(){
        this.legalCategory.click();
         Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='category']")));
         dropdown.selectByVisibleText("Corporate");
    }

    public void caseSubject(){
        this.caseSubject.sendKeys(inputs.randomAtoZ());
    }

    public void caseDescription(){
        this.caseDescription.sendKeys(inputs.randomAtoZ());
    }

    public void sendButton(){
        this.sendButton.click();
    }
}
