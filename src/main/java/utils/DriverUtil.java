package utils;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class DriverUtil extends EventFiringWebDriver {

    //private static WebDriver driver;
    private static String BROWSER = System.getProperty("browser");


    private static RemoteWebDriver driver = null;
    public DriverUtil(WebDriver driver) {
        super(driver);
    }

    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            quitBrowser();
        }
    };

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
        //getWebDriver();
    }

    public static WebDriver getWebDriver(){
        if (BROWSER.equalsIgnoreCase("chrome")) {
            return getChromeDriver();
        }else {
            return getGeckoDriver();
        }
    }

    public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "Tools/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getGeckoDriver(){
        System.setProperty("webdriver.gecko.driver", "Tools/geckodriver");
        driver = new FirefoxDriver();
        return driver;
    }
    public static void closeBrowser(){
        driver.close();
    }

    public static RemoteWebDriver getDriver(){
        return driver;
    }

    public static void quitBrowser(){
        try{
            driver.quit();
        } catch (NoSuchSessionException e) {
            System.out.println("The driver is already closed!!");
        }
    }
}
