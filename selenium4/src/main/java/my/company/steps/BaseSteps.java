package my.company.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.util.concurrent.TimeUnit;

/**
 * Created by sonya on 31.01.2018.
 */
public class BaseSteps {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    @Before
    public void startScenario(){
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.sberbank.ru/ru/person/");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver .manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public static void afterMethod(){
        driver .quit();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
