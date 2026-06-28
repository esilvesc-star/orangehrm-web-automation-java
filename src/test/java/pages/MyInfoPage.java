package pages;

import org.openqa.selenium.WebDriver;
import components.MyInfoComponent;
import utils.WaitUtils;

public class MyInfoPage {

    private MyInfoComponent myInfoComponent;
    private WaitUtils waitUtils;

    public MyInfoPage(WebDriver driver) {
        this.myInfoComponent = new MyInfoComponent(driver);
        this.waitUtils = new WaitUtils(driver);
    }

    public boolean personalDetailsFoiExibida() {
        waitUtils.aguardarElementoVisivel(
                myInfoComponent.tituloPersonalDetails);

        return myInfoComponent.tituloPersonalDetails.isDisplayed();
    }
}