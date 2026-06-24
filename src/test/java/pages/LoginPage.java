package pages;

import org.openqa.selenium.WebDriver;
import components.LoginComponent;
import utils.WaitUtils;
import org.junit.Assert;

public class LoginPage {

private LoginComponent loginComponent;
private WaitUtils waitUtils;

public LoginPage(WebDriver driver) {
    this.loginComponent = new LoginComponent(driver);
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

public void validarDashboard() {

    waitUtils.aguardarElementoVisivel(loginComponent.tituloDashboardHomePage);
  
    Assert.assertTrue(
        "Dashboard não foi exibido.",
        loginComponent.tituloDashboardHomePage.isDisplayed());
}

}