package steps.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.dashboard.DashboardPage;
import pages.login.LoginPage;
import utils.ConfigReader;
import utils.DriverManager;
import utils.EvidenceUtils;
import utils.JsonDataReader;

public class LoginSteps {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    // Pré-condições

    @Given("que estou na página de login do OrangeHRM")
    public void que_estou_na_pagina_de_login_do_orange_hrm() {
        loginPage = new LoginPage(DriverManager.getDriver());
        dashboardPage = new DashboardPage(DriverManager.getDriver());
    }

    // Ações

    @When("realizo login com credenciais válidas")
    public void realizo_login_com_credenciais_validas() {
        loginPage.preencherUsuario(ConfigReader.getUsername());
        loginPage.preencherSenha(ConfigReader.getPassword());
        loginPage.clicarBotaoLogin();
    }

    @When("informo um usuário válido")
    public void informo_um_usuario_valido() {
        loginPage.preencherUsuario(ConfigReader.getUsername());
    }

    @When("informo uma senha inválida")
    public void informo_uma_senha_invalida() {
        String senhaInvalida = JsonDataReader.obterValor(
                "data/login/usuarios.json",
                "senhaInvalida",
                "password");

        loginPage.preencherSenha(senhaInvalida);
    }

    @When("informo um usuário inválido")
    public void informo_um_usuario_invalido() {
        String usuarioInvalido = JsonDataReader.obterValor(
            "data/login/usuarios.json",
            "usuarioInvalido",
            "username");

        loginPage.preencherUsuario(usuarioInvalido);
    }

    @When("informo uma senha válida")
    public void informo_uma_senha_valida() {
        loginPage.preencherSenha(ConfigReader.getPassword());
    }

    @When("solicito o acesso")
    public void solicito_o_acesso() {
        loginPage.clicarBotaoLogin();

    }

    // Validações

    @Then("devo ser redirecionado para a tela inicial")
    public void devo_ser_redirecionado_para_a_tela_inicial() {
        Assert.assertTrue(
                "Tela inicial não foi exibida.",
                dashboardPage.dashboardEstaVisivel());

        EvidenceUtils.capturarScreenshot(
                "01 - Dashboard exibido após login");
    }

    @Then("devo visualizar a mensagem {string}")
    public void devo_visualizar_a_mensagem(String mensagemEsperada) {
        String mensagemExibida = loginPage.obterMensagemErro();

        Assert.assertEquals(
                "A mensagem de erro exibida não corresponde à esperada.",
                mensagemEsperada,
                mensagemExibida);

        EvidenceUtils.capturarScreenshot(
                "02 - Mensagem de erro no login");
    }
}