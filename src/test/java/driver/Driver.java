package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import recorder.VideoRecorder;

public class Driver {

    public static WebDriver webDriver;

    @BeforeSuite
    public void initializeDriver() throws Exception {
        VideoRecorder.startRecord("TrendyolTestRecording");
        webDriver = DriverFactory.getDriver();
        webDriver.manage().window().maximize();
    }

    @AfterSuite
    public void closeDriver() throws Exception {
        VideoRecorder.stopRecord();
        webDriver.quit();
    }
}
