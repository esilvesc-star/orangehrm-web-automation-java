package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import utils.ConfigReader;
import utils.DriverManager;
import utils.EvidenceUtils;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("--- INICIANDO CENÁRIO ---");

        DriverManager.createDriver();

        DriverManager.getDriver().get(
                ConfigReader.getUrlBase());
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("--- FINALIZANDO CENÁRIO ---");

        try {
            if (scenario.isFailed()) {
                EvidenceUtils.capturarScreenshot(
                        "Falha - " + scenario.getName());
            }
        } finally {
            DriverManager.quitDriver();
        }
    }
}