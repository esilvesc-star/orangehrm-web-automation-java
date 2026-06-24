package utils;

import org.openqa.selenium.WebDriver;

import browser.BrowserFactory;

public class DriverManager {

    // Instância única do WebDriver
    private static WebDriver driver;

    /*
     * Cria o navegador caso ele ainda não exista
     */
    public static void createDriver() {

        if (driver == null) {

            driver = BrowserFactory.createBrowser(
                    ConfigReader.getBrowser(),
                    ConfigReader.isHeadless()
            );
        }
    }

    /*
     * Retorna o WebDriver para utilização
     */
    public static WebDriver getDriver() {

        return driver;
    }

    /*
     * Fecha o navegador ao final da execução
     */
    public static void quitDriver() {

        if (driver != null) {

            driver.quit();

            driver = null;
        }
    }
}