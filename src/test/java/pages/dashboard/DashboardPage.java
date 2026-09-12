package pages.dashboard;

import org.openqa.selenium.WebDriver;

import components.dashboard.DashboardComponent;
import utils.WaitUtils;

public class DashboardPage {

    private final DashboardComponent dashboardComponent;
    private final WaitUtils waitUtils;

    public DashboardPage(WebDriver driver) {
        this.dashboardComponent = new DashboardComponent(driver);
        this.waitUtils = new WaitUtils(driver);
    }

    public boolean dashboardEstaVisivel() {
        waitUtils.aguardarUrlConter("/dashboard/index");

        waitUtils.aguardarElementoVisivel(
                dashboardComponent.tituloDashboardHomePage);

        return "Dashboard".equals(
                dashboardComponent.tituloDashboardHomePage
                        .getText()
                        .trim());
    }

    public void clicarMenuMyInfo() {
        waitUtils.aguardarElementoClicavel(
                dashboardComponent.menuMyInfo);

        dashboardComponent.menuMyInfo.click();
    }
}