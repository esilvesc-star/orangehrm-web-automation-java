package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverManager;
import org.junit.Assert;
import utils.EvidenceUtils;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("que estou na página de login do OrangeHRM")
    public void que_estou_na_pagina_de_login_do_orange_hrm() {
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("realizo login com credenciais válidas")
    public void realizo_login_com_credenciais_validas() {
        loginPage.informarUsername(ConfigReader.getUsername());
        loginPage.informarPassword(ConfigReader.getPassword());
        loginPage.clicarLogin();
    }

    @Then("devo ser redirecionado para a tela inicial")
    public void devo_ser_redirecionado_para_a_tela_inicial() {

    Assert.assertTrue(
            "Tela inicial não foi exibida.",
            loginPage.telaInicialFoiExibida());
}
}
