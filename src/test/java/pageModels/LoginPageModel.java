package pageModels;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageModel extends BaseModel {

    public static By CHOOSE_WOMAN = By.className("homepage-popup-img");
    public static By LOGIN_BUTTON = By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]");
    public static By EMAIL = By.id("login-email");
    public static By PASSWORD = By.id("login-password-input");
    public static By LOGIN = By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button");


    public LoginPageModel(WebDriver driver) {
        super(driver);
    }

    public void loginPage() {

        clickElement(CHOOSE_WOMAN);
        clickElement(LOGIN_BUTTON);
        sendKeys(EMAIL, "xxxxxx@gmail.com");
        sendKeys(PASSWORD, "xxxxxx");
        clickElement(LOGIN);
    }
}
