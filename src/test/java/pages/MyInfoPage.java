package pages;

import org.openqa.selenium.WebDriver;

import components.MyInfoComponent;
import utils.WaitUtils;

/**
 * Page responsável pelas ações e validações da tela My Info.
 *
 * Os métodos estão organizados de acordo com os fluxos
 * funcionais automatizados no módulo My Info.
 */
public class MyInfoPage {

    private final MyInfoComponent myInfoComponent;
    private final WaitUtils waitUtils;

    public MyInfoPage(WebDriver driver) {
        this.myInfoComponent = new MyInfoComponent(driver);
        this.waitUtils = new WaitUtils(driver);
    }

    // ======================================================
    // CENÁRIO: Acessar o módulo My Info
    // ======================================================

    public boolean personalDetailsFoiExibida() {
        waitUtils.aguardarElementoVisivel(
                myInfoComponent.tituloPersonalDetails);

        return myInfoComponent.tituloPersonalDetails.isDisplayed();
    }

    // ======================================================
    // CENÁRIO: Atualizar informações pessoais
    // ======================================================

    public void alterarOtherId(String valor) {
        waitUtils.aguardarElementoVisivel(
                myInfoComponent.campoOtherId);

        myInfoComponent.campoOtherId.clear();
        myInfoComponent.campoOtherId.sendKeys(valor);
    }

    public void clicarSalvar() {
        waitUtils.aguardarElementoClicavel(
                myInfoComponent.botaoSave);

        myInfoComponent.botaoSave.click();
    }

    public boolean mensagemSucessoFoiExibida() {
        waitUtils.aguardarElementoVisivel(
                myInfoComponent.mensagemSucesso);

        return myInfoComponent.mensagemSucesso.isDisplayed();
    }
}