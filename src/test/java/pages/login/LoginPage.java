package pages.login;

import org.openqa.selenium.WebDriver;
import components.login.LoginComponent;
import utils.WaitUtils;


public class LoginPage {

private LoginComponent loginComponent;

private WaitUtils waitUtils;

public LoginPage(WebDriver driver) {
    this.loginComponent = new LoginComponent(driver);
    this.waitUtils = new WaitUtils(driver);
}

public void preencherUsuario(String username) {
    waitUtils.aguardarElementoVisivel(loginComponent.usernameInput);
    loginComponent.usernameInput.clear();
    loginComponent.usernameInput.sendKeys(username);
}

public void preencherSenha(String password) {
    waitUtils.aguardarElementoVisivel(loginComponent.passwordInput);
    loginComponent.passwordInput.clear();
    loginComponent.passwordInput.sendKeys(password);
}

public void clicarBotaoLogin() {
    waitUtils.aguardarElementoClicavel(loginComponent.loginButton);
    loginComponent.loginButton.click();
}

}