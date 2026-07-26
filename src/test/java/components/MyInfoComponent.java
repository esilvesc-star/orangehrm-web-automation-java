package components;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoComponent {

    public MyInfoComponent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h6[normalize-space()='Personal Details' or normalize-space()='Datos Personales']")
    public WebElement tituloPersonalDetails;

    @FindBy(xpath = "//label[normalize-space()='Other Id']/parent::div/following-sibling::div//input")
    public WebElement campoOtherId;

    @FindBy(xpath = "//label[normalize-space()='Other Id']/ancestor::form//button[@type='submit' and normalize-space()='Save']")
    public WebElement botaoSave;

    @FindBy(xpath = "//div[contains(@class,'oxd-toast') and contains(.,'Successfully Updated')]")
    public WebElement mensagemSucesso;

    @FindBy(css = ".oxd-loading-spinner")
    public List<WebElement> loadingSpinners;

    // ======================================================
    // Lista de seções disponíveis na tela My Info
    // ======================================================

    @FindBy(xpath = "//a[normalize-space()='Personal Details']")
    public WebElement secaoPersonalDetails;

    @FindBy(xpath = "//a[normalize-space()='Contact Details']")
    public WebElement secaoContactDetails;

    @FindBy(xpath = "//a[normalize-space()='Emergency Contacts']")
    public WebElement secaoEmergencyContacts;

    @FindBy(xpath = "//a[normalize-space()='Dependents']")
    public WebElement secaoDependents;

    @FindBy(xpath = "//a[normalize-space()='Immigration']")
    public WebElement secaoImmigration;

    @FindBy(xpath = "//a[normalize-space()='Job']")
    public WebElement secaoJob;

    @FindBy(xpath = "//a[normalize-space()='Salary']")
    public WebElement secaoSalary;

    @FindBy(xpath = "//a[normalize-space()='Report-to']")
    public WebElement secaoReportTo;

    @FindBy(xpath = "//a[normalize-space()='Qualifications']")
    public WebElement secaoQualifications;

    @FindBy(xpath = "//a[normalize-space()='Memberships']")
    public WebElement secaoMemberships;

}