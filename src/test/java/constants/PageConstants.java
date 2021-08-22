package constants;

import org.openqa.selenium.By;


public class PageConstants {
    public static By CHOOSE_WOMAN = By.className("homepage-popup-img");
    public static By LOGIN_BUTTON = By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]");
    public static By EMAIL = By.id("login-email");
    public static By PASSWORD = By.id("login-password-input");
    public static By LOGIN = By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button");
    public static By WOMAN = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[1]/a");
    public static By MAN = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[2]/a");
    public static By KIDS = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[3]/a");
    public static By HOME = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[4]/a");
    public static By SUPERMARKET = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[5]/a");
    public static By COSMETIC = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[6]/a");
    public static By SHOE_BAG = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[7]/a");
    public static By CLOCK_ACCESSORIES = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[8]/a");
    public static By ELECTRONIC = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[9]/a");
    public static By BOUTIQUES = By.xpath("//span[contains(@class,'image-container')]/img");
    public static By PRODUCTS = By.xpath("//div[contains(@class,'image-container')]");
    public static By PLACE_HOLDER = By.xpath("//img[contains(@src,'boutique_placeholder')]");
    public static By PRODUCTS_PLACE_HOLDER = By.xpath("//img[contains(@src,'defaultThumb')]/../../..");
    public static By ADD_BASKET = By.xpath("//div[contains(@class,'prc-inf-wrp')]");
    public static By BASKET = By.xpath("//a[contains(@class,'account-basket')]");
}
