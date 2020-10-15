package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //WE NEED DRIVER CAUSE WE WANT TO HAVE A SINGLE driver
    // We are making Singleton Class


    //Create a static driver instance
    //Because it can be used Globally.
    //Private bcs to  call only in this class

    private static WebDriver driver;

    //Create a public static method to instantiate the driver
    public static WebDriver getDriver(){

        //I want to instantiate the driver if driver is not pointing anywhere.
        //If driver is already pointing somewhere(being used)
        if(driver == null){
            switch(ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }

            }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;


    }
    public static void closeDriver() {
        //Close driver if it is not null
        //it means driver is [pointing chrome (or being used)
        if (driver != null) {
            driver.quit();

            //driver is still pointing the chrome it is not null
            driver = null;
        }

    }
    }
