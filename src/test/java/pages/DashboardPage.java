package pages;

import org.openqa.selenium.WebDriver;
import components.DashboardComponent;
import utils.WaitUtils;

public class DashboardPage {
    
    private DashboardComponent dashboardComponent;
    private WaitUtils waitUtils;

    public DashboardPage(WebDriver driver) {
        this.dashboardComponent = new DashboardComponent(driver);
        this.waitUtils = new WaitUtils(driver);
    }

     public void clicarMenuMyInfo() {
        waitUtils.aguardarElementoVisivel(dashboardComponent.menuMyInfo);
        dashboardComponent.menuMyInfo.click();
    }  
}
