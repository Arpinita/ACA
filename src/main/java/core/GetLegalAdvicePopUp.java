package core;

import common.Inputs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageObject.user.myLegalEnquiries.EnterNewLegalEnquiry;

import java.util.List;
import java.util.Random;

public class GetLegalAdvicePopUp {

    public WebDriver webDriver;
    public String xpathSelect;
    public String xpathSubject;
    public String inputSubject;
    public String inputDescription;
    public String xpathDescription;

    public GetLegalAdvicePopUp(WebDriver webDriverF,EnterNewLegalEnquiry xpaths){
        webDriver = webDriverF;
        xpathSelect = xpaths.SelectFileInputXpath;
        xpathSubject = xpaths.SubjectXpath;
        inputSubject = new Inputs().random_text;
        inputDescription = new Inputs().random_text;
        xpathDescription = xpaths.DescriptionXpath;

    }

//    @FindBy(xpath = "//div[@class='widget']")
//    WebElement getLegalAdvicePopUp;

//    @FindBy(xpath = "//*[@id='case_subject']")
//    WebElement enterYourSubject;
//    @FindBy(xpath = "//*[@id='case_description']")
//    WebElement messageDescription;
//    @FindBy(xpath = "//*[@id='linkLawbiteDoc']")
//    WebElement linkToLawbiteDoc;
//    @FindBy(xpath = "//button[@class='select-file']")
//    WebElement buttonSelectFile;
//    @FindBy(xpath = "//a[@id='sendbtn']")
//    WebElement submitButton;




    public void selectRandomFromDropdownList()
    {
        Select category_list = new Select (webDriver.findElement(By.xpath(xpathSelect)));
        int randomIndex = new Random().nextInt(category_list.getOptions().size());
        category_list.selectByIndex(randomIndex);
   }

   public void setSubjectValue(){
       webDriver.findElement(By.xpath(xpathSubject)).sendKeys(inputSubject);
   }

    public void setDescriptionValue(){
        webDriver.findElement(By.xpath(xpathDescription)).sendKeys(inputDescription);
    }

//    public void enterMessage(){

//       }

    }

