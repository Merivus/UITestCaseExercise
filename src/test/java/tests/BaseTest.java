package tests;

import driver.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class BaseTest {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {

        driver = BaseDriver.setUp("chrome");
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(){
        getDriver().quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
