package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObject.Base;


public class ReceiptPage extends Base{
    final String BASE_URL = "http://lawbite.codebnb.me/";
    @FindBy(xpath = BASE_URL)
    private WebElement header;
    public ReceiptPage(WebDriver driver){

        super(driver);
    }
    public String confirmationHeader(){
        return header.getText();
    }
}