package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReusableUtils {

	private static WebDriver driver;


	static {
		driver = DriverUtil.getWebDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

    public static void sleep(int sec)  {
        try {
			Thread.sleep(sec);

		} catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	public static void openWebPage(String url) {
		driver.get(url);
	}

	public static void refreshPage()  {
		driver.navigate().refresh();
		sleep(1000);
	}

	public static void waitForElementClickable(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static List<WebElement> findElements(By by) {
		sleep(2000);
		return driver.findElements(by);
	}

	public static void clickElement(By by){
		driver.findElement(by).click();
	}

	public static void elementSetText(By by, String text){
		driver.findElement(by).sendKeys(text);
	}

	public static void selectFromDropdownByName(By by, String name){
		Select sel = new Select(driver.findElement(by));
		sel.selectByVisibleText(name);
	}
}
