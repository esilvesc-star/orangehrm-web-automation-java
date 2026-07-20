package utils;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

/**
 * Classe utilitária responsável pela captura e anexação
 * de evidências ao relatório Allure.
 */
public final class EvidenceUtils {

    private EvidenceUtils() {
        // Impede a instanciação da classe.
    }

    public static void capturarScreenshot(String nomeEvidencia) {

        WebDriver driver = DriverManager.getDriver();

        if (driver == null) {
            System.out.println(
                    "Não foi possível capturar a evidência: WebDriver nulo.");
            return;
        }

        byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);

        Allure.addAttachment(
                nomeEvidencia,
                "image/png",
                new ByteArrayInputStream(screenshot),
                ".png");
    }
}