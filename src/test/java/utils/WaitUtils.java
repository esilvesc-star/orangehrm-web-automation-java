package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.function.BooleanSupplier;

public class WaitUtils {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(ConfigReader.getTimeout()));
    }

    public void aguardarElementoVisivel(WebElement elemento) {
        wait.until(
                ExpectedConditions.visibilityOf(elemento));
    }

    public void aguardarElementoClicavel(WebElement elemento) {
        wait.until(
                ExpectedConditions.elementToBeClickable(elemento));
    }

    public void aguardarUrlConter(String trechoUrl) {
        wait.until(
                ExpectedConditions.urlContains(trechoUrl));
    }

    public void aguardarCarregamentoFinalizar() {
        wait.until(driver -> driver.findElements(
                By.cssSelector(".oxd-loading-spinner"))
                .isEmpty());
    }

    public void aguardarPaginaCarregar() {
        wait.until(driver -> "complete".equals(
                ((JavascriptExecutor) driver)
                        .executeScript(
                                "return document.readyState")));
    }

    public boolean aguardarAtributoComValor(
            WebElement elemento,
            String valorEsperado) {

        try {
            wait.until(
                    ExpectedConditions.attributeToBe(
                            elemento,
                            "value",
                            valorEsperado));

            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean elementoFicouVisivel(WebElement elemento) {
        try {
            wait.until(ExpectedConditions.visibilityOf(elemento));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void atualizarPagina() {
        aguardarCarregamentoFinalizar();

        driver.navigate().refresh();

        aguardarPaginaCarregar();
        aguardarCarregamentoFinalizar();
    }
}