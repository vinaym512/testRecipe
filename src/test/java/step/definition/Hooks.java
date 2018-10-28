package step.definition;

import utils.DriverUtil;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Hooks {


    @BeforeClass
    public static void start(){
        DriverUtil.getDriver();
    }

//    @After()
//    public static void embedScreenshot(Scenario scenario) {
//        if (scenario.isFailed()) {
//            scenario.embed(((TakesScreenshot) DriverUtil.getWebDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
//        }
//        DriverUtil.closeBrowser();
//    }
    @AfterClass
    public static void close() {
        DriverUtil.quitBrowser();
    }
}
