package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

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

        waitUtils.aguardarUrlConter(
                "viewPersonalDetails");

        waitUtils.aguardarPaginaCarregar();
        waitUtils.aguardarCarregamentoFinalizar();

        waitUtils.aguardarElementoVisivel(
                myInfoComponent.tituloPersonalDetails);

        return myInfoComponent.tituloPersonalDetails.isDisplayed();
    }

    // ======================================================
    // CENÁRIO: Validar seções disponíveis na tela My Info
    // ======================================================

    public boolean secaoEstaDisponivel(String nomeSecao) {
        WebElement secao = obterSecao(nomeSecao);

        waitUtils.aguardarElementoVisivel(secao);

        return secao.isDisplayed();
    }

    private WebElement obterSecao(String nomeSecao) {
        switch (nomeSecao.trim().toUpperCase()) {

            case "PERSONAL DETAILS":
                return myInfoComponent.secaoPersonalDetails;

            case "CONTACT DETAILS":
                return myInfoComponent.secaoContactDetails;

            case "EMERGENCY CONTACTS":
                return myInfoComponent.secaoEmergencyContacts;

            case "DEPENDENTS":
                return myInfoComponent.secaoDependents;

            case "IMMIGRATION":
                return myInfoComponent.secaoImmigration;

            case "JOB":
                return myInfoComponent.secaoJob;

            case "SALARY":
                return myInfoComponent.secaoSalary;

            case "REPORT-TO":
                return myInfoComponent.secaoReportTo;

            case "QUALIFICATIONS":
                return myInfoComponent.secaoQualifications;

            case "MEMBERSHIPS":
                return myInfoComponent.secaoMemberships;

            default:
                throw new IllegalArgumentException(
                        "Seção não implementada: " + nomeSecao);
        }
    }

    // ======================================================
    // CENÁRIO: Atualizar informações pessoais
    // ======================================================

    public void alterarOtherId(String valor) {
        waitUtils.aguardarElementoVisivel(
                myInfoComponent.campoOtherId);

        myInfoComponent.campoOtherId.click();

        myInfoComponent.campoOtherId.sendKeys(
                Keys.chord(Keys.CONTROL, "a"));

        myInfoComponent.campoOtherId.sendKeys(Keys.BACK_SPACE);
        myInfoComponent.campoOtherId.sendKeys(valor);

        waitUtils.aguardarAtributoComValor(
                myInfoComponent.campoOtherId,
                valor);

        // Retira o foco do campo e confirma a alteração para a aplicação.
        myInfoComponent.campoOtherId.sendKeys(Keys.TAB);
    }

    public boolean botaoSaveEstaHabilitado() {
        waitUtils.aguardarElementoClicavel(
                myInfoComponent.botaoSave);

        return myInfoComponent.botaoSave.isEnabled();
    }

    public void clicarSalvar() {
        waitUtils.aguardarCarregamentoFinalizar();

        waitUtils.aguardarElementoClicavel(
                myInfoComponent.botaoSave);

        myInfoComponent.botaoSave.click();
    }

    public boolean mensagemSucessoFoiExibida() {
        return waitUtils.elementoFicouVisivel(
                myInfoComponent.mensagemSucesso);
    }

    // ======================================================
    // CENÁRIO: Persistência das informações pessoais
    // ======================================================

    public boolean otherIdFoiPersistido(String valorEsperado) {

        waitUtils.atualizarPagina();

        waitUtils.aguardarElementoVisivel(
                myInfoComponent.campoOtherId);

        return waitUtils.aguardarAtributoComValor(
                myInfoComponent.campoOtherId,
                valorEsperado);
    }

}
