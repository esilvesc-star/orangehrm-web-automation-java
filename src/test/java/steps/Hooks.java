package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;
import utils.DriverManager;

public class Hooks {

    /*
     * Executa antes de cada cenário Cucumber.
     *
     * Responsabilidades:
     * - Criar o navegador
     * - Acessar a URL base do sistema
     * - Exibir no console qual cenário está iniciando
     */
    @Before
    public void beforeScenario(Scenario scenario) {

        System.out.println("\n--- INICIANDO CENÁRIO ---");
        System.out.println(scenario.getName());

        DriverManager.createDriver();

        DriverManager.getDriver().get(ConfigReader.getUrlBase());
    }

    /*
     * Executa depois de cada cenário Cucumber.
     *
     * Responsabilidades:
     * - Exibir no console o status do cenário
     * - Fechar o navegador
     */
    @After
    public void afterScenario(Scenario scenario) {

        System.out.println("\n--- FINALIZANDO CENÁRIO ---");
        System.out.println(scenario.getName());
        System.out.println("Status: " + scenario.getStatus());

        DriverManager.quitDriver();
    }
}
