package pageModels;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;


public class BaseModel {

    WebDriver driver;
    WebDriverWait wait;
    final static Logger logger = Logger.getLogger(BaseModel.class);

    public BaseModel(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,5);
    }

    public void elementClickable(By by){

        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void elementAppear(By by){

        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement findElement(By by){
        elementAppear(by);
        return driver.findElement(by);
    }

    public void sendKeys(By by,String text){
        elementClickable(by);
        findElement(by).sendKeys(text);
    }

    public void clickElement(By by){
        elementClickable(by);
        findElement(by).click();
    }

    public String getBoutiqueAttribute(WebElement element){

        return element.getAttribute("alt");
    }

    public String getProductAttribute(WebElement element){

        return element.getAttribute("title");
    }

    public void productPageLoad(By by) throws InterruptedException {
        List<WebElement> element = null;
        int beforeLoading = driver.findElements(by).size();
        int afterLoading = 0;
        while(beforeLoading!=afterLoading && beforeLoading > 5){
            element = driver.findElements(by);
            beforeLoading = driver.findElements(by).size();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element.get(element.size()-1));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element.get(element.size()-5));
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            afterLoading = driver.findElements(by).size();
        }
    }

    public void boutiquePageLoad(By by) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        int beforeLoading = driver.findElements(by).size();
        int afterLoading = 0;
        while(beforeLoading!=afterLoading){
            beforeLoading = driver.findElements(by).size();
            Thread.sleep(1000);
            afterLoading = driver.findElements(by).size();
        }
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
    }

    public void isElementExist(By by){
        List<WebElement> lists = driver.findElements(by);
        logger.info(lists.size());
        if(driver.findElements(by).size()!=0){
            for( WebElement list : lists)
                logger.error("İmajı olmayan butikler:" + getBoutiqueAttribute(list));
        }
    }

    public void isProductExist(By by){
        List<WebElement> lists = driver.findElements(by);
        logger.info(lists.size());
        if(driver.findElements(by).size()!=0){
            for( WebElement list : lists)
                logger.error("İmajı olmayan ürünler:" + getProductAttribute(list));
        }
    }

    public void selectBoutique(By by){
        Random random = new Random();
        List<WebElement> boutique = driver.findElements(by);
        int index = random.nextInt(boutique.size());
        boutique.get(index).click();
    }

    public void controlBoutiqueImage(By by,By byBoutique, By byPlaceHolder) throws InterruptedException {
        clickElement(by);
        logger.info("Test Edilecek Sayfa : " + driver.getTitle());
        boutiquePageLoad(byBoutique);
        isElementExist(byPlaceHolder);

    }
}
