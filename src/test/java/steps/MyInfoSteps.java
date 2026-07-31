package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
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
                myInfoPage = new MyInfoPage(
                                DriverManager.getDriver());

                Assert.assertTrue(
                                "Tela Personal Details não foi exibida.",
                                myInfoPage.personalDetailsFoiExibida());
        }

        // ======================================================
        // CENÁRIO: Validar seções disponíveis na tela My Info
        // ======================================================

        @Then("as seguintes seções devem estar disponíveis:")
        public void as_seguintes_secoes_devem_estar_disponiveis(
                        DataTable dataTable) {

                myInfoPage = new MyInfoPage(
                                DriverManager.getDriver());

                List<String> secoesEsperadas = dataTable.asList();

                for (String secao : secoesEsperadas) {
                        Assert.assertTrue(
                                        "A seção '" + secao + "' não está disponível.",
                                        myInfoPage.secaoEstaDisponivel(secao));
                }

                EvidenceUtils.capturarScreenshot(
                                "Seções disponíveis na tela My Info");
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

                switch (campo.trim().toUpperCase()) {
                        case "OTHER ID":
                                myInfoPage.alterarOtherId(valor);

                                EvidenceUtils.capturarScreenshot(
                                                "03 - Campo Other Id preenchido");
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

        @Then("o botão {string} deve estar habilitado")
        public void o_botao_deve_estar_habilitado(String nomeBotao) {
                myInfoPage = new MyInfoPage(
                                DriverManager.getDriver());

                Assert.assertTrue(
                                "O botão '" + nomeBotao + "' não está habilitado.",
                                myInfoPage.botaoSaveEstaHabilitado());

                EvidenceUtils.capturarScreenshot(
                "05 - Botão Salvar habilitado"
    );
        }

        @Then("a mensagem de sucesso deve ser exibida")
        public void a_mensagem_de_sucesso_deve_ser_exibida() {

                Assert.assertTrue(
                                "A mensagem 'Successfully Updated' não foi exibida após o salvamento.",
                                myInfoPage.mensagemSucessoFoiExibida());

                EvidenceUtils.capturarScreenshot(
                                "04 - Mensagem de atualização exibida com sucesso");
        }

        // ======================================================
        // CENÁRIO: Persistência das informações pessoais
        // ======================================================

        @Then("o campo {string} deve conter o valor {string}")
        public void o_campo_deve_conter_o_valor(
                        String campo,
                        String valorEsperado) {

                boolean valorPersistido;

                switch (campo.trim().toUpperCase()) {

                        case "OTHER ID":
                                valorPersistido = myInfoPage.otherIdFoiPersistido(
                                                valorEsperado);
                                break;

                        default:
                                throw new IllegalArgumentException(
                                                "Campo não implementado: " + campo);
                }

                Assert.assertTrue(
                                "O valor '" + valorEsperado
                                                + "' não foi persistido no campo '"
                                                + campo + "'.",
                                valorPersistido);

                EvidenceUtils.capturarScreenshot(
                                "05 - Valor persistido após atualizar a página");
        }
}