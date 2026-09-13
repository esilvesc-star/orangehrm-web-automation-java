package pages.login;

import org.openqa.selenium.WebDriver;

import components.login.LoginComponent;
import utils.WaitUtils;

public class LoginPage {

    // Atributos
    private final LoginComponent loginComponent;
    private final WaitUtils waitUtils;

    // Inicialização dos componentes e das esperas
    public LoginPage(WebDriver driver) {
        this.loginComponent = new LoginComponent(driver);
        this.waitUtils = new WaitUtils(driver);
    }

    // Ações
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

    // Consultas
    public String obterMensagemErro() {
        waitUtils.aguardarElementoVisivel(
                loginComponent.mensagemErroAutenticacao);

        return loginComponent.mensagemErroAutenticacao
                .getText()
                .trim();
    }
}