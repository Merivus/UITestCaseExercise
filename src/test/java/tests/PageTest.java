package tests;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageModels.ControlPageModel;
import pageModels.LoginPageModel;
import pageModels.AddToBasketModel;

public class PageTest extends BaseTest{

    final static Logger logger = Logger.getLogger(PageTest.class);
    ControlPageModel controlPageModel;
    LoginPageModel loginPageModel;
    AddToBasketModel addToBasketModel;

    @Before
    public void beforeTest(){
        loginPageModel = new LoginPageModel(getDriver());
        controlPageModel = new ControlPageModel(getDriver());
        addToBasketModel = new AddToBasketModel(getDriver());
        getDriver().navigate().to("https://www.trendyol.com/");
        logger.info("Test Edilecek Sayfa : " + getDriver().getTitle());
    }

    @Test
    public void pageTest() throws InterruptedException {
        loginPageModel.loginPage();
        controlPageModel.controlPage();
        addToBasketModel.addToBasket();
    }

    @After
    public void afterTest(){
        getDriver().quit();
    }
}
