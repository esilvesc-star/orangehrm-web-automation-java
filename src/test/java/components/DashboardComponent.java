package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardComponent {

    public DashboardComponent(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    
    @FindBy(className = "oxd-topbar-header-title")
    public WebElement tituloDashboardHomePage;

    @FindBy(css = "a[href='/web/index.php/pim/viewMyDetails']")
    public WebElement menuMyInfo;
}
