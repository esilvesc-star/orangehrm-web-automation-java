package components.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginComponent {

    public LoginComponent(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    // Campos
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;
    
    // Botões
    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;
    
    // Mensagens
    @FindBy(css = ".oxd-alert-content-text")
    public WebElement mensagemErroAutenticacao;
   
}
