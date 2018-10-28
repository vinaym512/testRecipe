package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ReusableUtils {

	private static WebDriver driver;

	static {
		driver = DriverUtil.getWebDriver();
	}

    public static void sleep(int sec)  {
        try {
            driver.wait(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	public static void openWebPage(String url) {
		driver.get(url);
	}

	public static void waitForElementClicable(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static void waitForElementVisible(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}


	public static WebElement findElement(By by){
		return driver.findElement(by);
	}

	public static boolean isElementPresent(By by) {
		return findElement(by).isDisplayed();
	}

	public static void clickElement(By by){
		driver.findElement(by).click();
	}

    public static String elementGetText(By by){
	    return driver.findElement(by).getText();
	}

	public static void selectFromDropdownByName(By by, String name){
		Select sel = new Select(driver.findElement(by));
		sel.selectByVisibleText(name);
	}

    public static List<String> getTextFromTable(By by){
		List<WebElement> tr_collection=driver.findElements(by);
        List<String> items = new ArrayList<String>();

        for(WebElement tdElement : tr_collection) {
                items.add(tdElement.getText());
        }
        return items;
	}
}
