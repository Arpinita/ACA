package common;


import static common.TAGS.*;
import static common.Config.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;


public class Driver {

    private int drive = CURENT_DRIVER;
    private WebDriver driver;

    public WebDriver getDriver(){
        driver();
        return driver;
    }


    public String getWebDriver() {
        String webdriver = "";
        String path = System.getProperty("user.dir") + File.separator + "requirements" + File.separator + "webdrivers" + File.separator;
        Boolean arch32 = System.getProperty("os.arch").contains("32");
        Boolean arch64 = System.getProperty("os.arch").contains("64");
        Boolean Windows = System.getProperty("os.name").contains("Windows");
        Boolean Linux = System.getProperty("os.name").contains("Linux");
        if (Windows && drive == CHROME) {
            webdriver = path + "chromedriver.exe";
        } else if (Linux && arch64 && drive == CHROME) {
            webdriver = path + "chromedriver64linux";
        } else if (Linux && arch32 && drive == CHROME) {
            webdriver = path + "chromedriver32linux";
        } else if (Windows && arch64 && drive == OPERA) {
            webdriver = path + "operadriver.exe";
        } else if (Windows && arch32 && drive == OPERA) {
            webdriver = path + "operadriver32.exe";
        } else if (Linux && arch64 && drive == OPERA) {
            webdriver = path + "operadriver64";
        } else if (Linux && arch32 && drive == OPERA) {
            webdriver = path + "operadriver32";
        } else if (Windows && drive == EDGE) {
            webdriver = path + "edge.exe";
        } else if (Linux && arch64 && drive == FIREFOX) {
            webdriver = path + "geckodriver64";
        } else if (Linux && arch32 && drive == FIREFOX) {
            webdriver = path + "geckodriver32";
        } else if (Windows && drive == IE) {
            webdriver = path + "iedriver.exe";
        } else if (Windows && drive == FIREFOX) {
            webdriver = path + "geckodriver.exe";
        }
        return webdriver;
    }

        private void driver(){
            String webdriver = getWebDriver();

        switch (drive) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", webdriver);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver();
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", webdriver);
                driver = new InternetExplorerDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", webdriver);
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                driver = new FirefoxDriver(capabilities);
                break;
            case OPERA:
                System.setProperty("webdriver.opera.driver", webdriver);
                driver = new OperaDriver();
                break;
            case EDGE:
                System.setProperty("webdriver.edge.driver", webdriver);
                driver = new EdgeDriver();
                break;
        }
         driver.get(BASE_URL);

    }
}


