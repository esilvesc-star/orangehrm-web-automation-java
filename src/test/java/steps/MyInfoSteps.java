package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import pages.LoginPage;
import pages.DashboardPage;
import pages.MyInfoPage;
import utils.ConfigReader;
import utils.DriverManager;

public class MyInfoSteps {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private MyInfoPage myInfoPage;

    @Given("que realizei login com credenciais válidas")
    public void que_realizei_login_com_credenciais_válidas() {
        loginPage = new LoginPage(DriverManager.getDriver());

        loginPage.informarUsername(ConfigReader.getUsername());
        loginPage.informarPassword(ConfigReader.getPassword());
        loginPage.clicarLogin();
   
    }
    @When("acessar o módulo My Info")
    public void acessar_o_módulo() {   
        dashboardPage = new DashboardPage(DriverManager.getDriver());
        dashboardPage.clicarMenuMyInfo();
   
    }
    @Then("a tela Personal Details deve ser exibida")
    public void a_tela_deve_ser_exibida() {
        myInfoPage = new MyInfoPage(DriverManager.getDriver());

        Assert.assertTrue(
                "Tela Personal Details não foi exibida.",
                myInfoPage.personalDetailsFoiExibida());
  
    }
  
}
