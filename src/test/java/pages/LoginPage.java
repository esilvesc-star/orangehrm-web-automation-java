package pages;

import org.openqa.selenium.WebDriver;
import components.LoginComponent;
import components.DashboardComponent;
import utils.WaitUtils;


public class LoginPage {

private LoginComponent loginComponent;
private DashboardComponent dashboardComponent;
private WaitUtils waitUtils;

public LoginPage(WebDriver driver) {
    this.loginComponent = new LoginComponent(driver);
    this.dashboardComponent = new DashboardComponent(driver);
    this.waitUtils = new WaitUtils(driver);
}

public void informarUsername(String username) {
    waitUtils.aguardarElementoVisivel(loginComponent.usernameInput);
    loginComponent.usernameInput.sendKeys(username);

}

public void informarPassword(String password) {
    loginComponent.passwordInput.sendKeys(password);

}
public void clicarLogin() {
    loginComponent.loginButton.click();

}

public boolean telaInicialFoiExibida() {

    waitUtils.aguardarElementoVisivel(
            dashboardComponent.tituloDashboardHomePage);

    return dashboardComponent.tituloDashboardHomePage.isDisplayed();
}

}