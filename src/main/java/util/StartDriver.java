package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartDriver {

    private static WebDriver driver = null;
    private static StartDriver startDriverInstance = null;
    private static final String URL = LoadFromProp.getProperty("url");
    private static final String browser = LoadFromProp.getProperty("browser");

    private StartDriver(){
        driver = Browsers.getBrowser(browser);
        if(driver != null){
            driver.manage().window().maximize();
            driver.navigate().to(URL);
        }
    }

    public static StartDriver getInstance(){
        if(startDriverInstance == null){
            startDriverInstance = new StartDriver();
        }
        return  startDriverInstance;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public static void close(){
        driver.quit();
    }

}
