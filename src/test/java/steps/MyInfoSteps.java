package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import pages.DashboardPage;
import pages.LoginPage;
import pages.MyInfoPage;
import utils.ConfigReader;
import utils.DriverManager;
import utils.EvidenceUtils;

/**
 * Steps responsáveis pelos cenários do módulo My Info.
 *
 * Os métodos estão organizados de acordo com os fluxos
 * funcionais automatizados.
 */
public class MyInfoSteps {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private MyInfoPage myInfoPage;

    // ======================================================
    // PRÉ-CONDIÇÃO COMUM: Usuário autenticado
    // ======================================================

    @Given("que realizei login com credenciais válidas")
    public void que_realizei_login_com_credenciais_validas() {
        loginPage = new LoginPage(DriverManager.getDriver());

        loginPage.informarUsername(ConfigReader.getUsername());
        loginPage.informarPassword(ConfigReader.getPassword());
        loginPage.clicarLogin();
    }

    // ======================================================
    // ACESSO AO MÓDULO MY INFO
    // ======================================================

   @When("acessar o módulo My Info")
    public void acessar_o_modulo_my_info() {
    dashboardPage = new DashboardPage(
            DriverManager.getDriver());

    dashboardPage.clicarMenuMyInfo();

    myInfoPage = new MyInfoPage(
            DriverManager.getDriver());

    myInfoPage.personalDetailsFoiExibida();

    EvidenceUtils.capturarScreenshot(
            "01 - Tela Personal Details exibida");
}

    // ======================================================
    // CENÁRIO: Acessar o módulo My Info
    // ======================================================

    @Then("a tela Personal Details deve ser exibida")
    public void a_tela_personal_details_deve_ser_exibida() {
        myInfoPage = new MyInfoPage(DriverManager.getDriver());

        Assert.assertTrue(
                "Tela Personal Details não foi exibida.",
                myInfoPage.personalDetailsFoiExibida());
    }

    // ======================================================
    // CENÁRIO: Atualizar informações pessoais
    // ======================================================

    @When("eu atualizo o campo {string} com o valor {string}")
    public void eu_atualizo_o_campo_com_o_valor(
        String campo,
        String valor) {

    myInfoPage = new MyInfoPage(
            DriverManager.getDriver());

    switch (campo.toUpperCase()) {

        case "OTHER ID":
            myInfoPage.alterarOtherId(valor);

            EvidenceUtils.capturarScreenshot(
                    "02 - Campo Other Id preenchido");
            break;

        default:
            throw new IllegalArgumentException(
                    "Campo não implementado: " + campo);
    }
}

    @When("salvar as alterações")
    public void salvar_as_alteracoes() {
    myInfoPage.clicarSalvar();
}

    @Then("a mensagem de sucesso deve ser exibida")
    public void a_mensagem_de_sucesso_deve_ser_exibida() {

    Assert.assertTrue(
            "A mensagem de sucesso não foi exibida.",
            myInfoPage.mensagemSucessoFoiExibida());

    EvidenceUtils.capturarScreenshot(
            "03 - Mensagem de atualização exibida com sucesso");
}
}