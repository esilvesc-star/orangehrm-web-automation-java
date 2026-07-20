package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoComponent {

    public MyInfoComponent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h6[text()='Personal Details']")
    public WebElement tituloPersonalDetails;

    @FindBy(xpath = "//label[normalize-space()='Other Id']/parent::div/following-sibling::div//input")
    public WebElement campoOtherId;

     @FindBy(xpath = "//button[@type='submit' and normalize-space()='Save']")
    public WebElement botaoSave;

    @FindBy(xpath = "//div[contains(@class,'oxd-toast')]")
    public WebElement mensagemSucesso;

}