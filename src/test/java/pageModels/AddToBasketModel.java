package pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToBasketModel extends BaseModel {

    public static By BOUTIQUES = By.xpath("//span[contains(@class,'image-container')]/img");
    public static By PRODUCTS = By.xpath("//div[contains(@class,'image-container')]");
    public static By PRODUCTS_PLACE_HOLDER = By.xpath("//img[contains(@src,'defaultThumb')]/../../..");
    public static By ADD_BASKET = By.xpath("//button[contains(@class,'add-to-basket')]");
    public static By BASKET = By.xpath("//a[contains(@class,'account-basket')]");

    public AddToBasketModel(WebDriver driver) {
        super(driver);
    }

    public void addToBasket() throws InterruptedException {

        selectBoutique(BOUTIQUES);
        productPageLoad(PRODUCTS);
        isProductExist(PRODUCTS_PLACE_HOLDER);
        selectBoutique(PRODUCTS);
        clickElement(ADD_BASKET);
        clickElement(BASKET);
    }
}
