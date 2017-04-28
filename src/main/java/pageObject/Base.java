package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Arpine on 4/26/2017.
 */
public class Base {


    public WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

