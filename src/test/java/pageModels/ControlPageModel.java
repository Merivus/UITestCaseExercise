package pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ControlPageModel extends BaseModel {

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

    public static By PLACE_HOLDER = By.xpath("//img[contains(@src,'boutique_placeholder')]");

    public ControlPageModel(WebDriver driver) {
        super(driver);
    }

    public void controlPage() throws InterruptedException {

        controlBoutiqueImage(WOMAN,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(MAN,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(KIDS,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(HOME,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(SUPERMARKET,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(COSMETIC,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(SHOE_BAG,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(CLOCK_ACCESSORIES,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(ELECTRONIC,BOUTIQUES,PLACE_HOLDER);
    }
}
