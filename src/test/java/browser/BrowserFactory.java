package browser;

// Importa a interface principal do Selenium
import org.openqa.selenium.WebDriver;

// Importa o navegador Chrome
import org.openqa.selenium.chrome.ChromeDriver;

// Permite configurar opções do Chrome
import org.openqa.selenium.chrome.ChromeOptions;

// Faz download automático do ChromeDriver
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

    // Método principal da fábrica
    // Recebe qual navegador abrir e se será headless
    public static WebDriver createBrowser(String browser, boolean headless) {

        // Se o navegador for Chrome
        if (browser.equalsIgnoreCase("chrome")) {

            // Chama o método responsável por abrir o Chrome
            return createChrome(headless);
        }

        // Caso o navegador não exista
        throw new RuntimeException(
                "Browser não suportado: " + browser);
    }

    // Método responsável por configurar e abrir o Chrome
    private static WebDriver createChrome(boolean headless) {

        // Faz download automático do driver compatível
        WebDriverManager.chromedriver().setup();

        // Objeto de configuração do Chrome
        ChromeOptions options = new ChromeOptions();

        // Abre maximizado
        options.addArguments("--start-maximized");

        // Evita problemas de comunicação em algumas versões
        options.addArguments("--remote-allow-origins=*");

        // Se headless=true
        if (headless) {

            // Executa sem abrir a janela
            options.addArguments("--headless=new");

            // Define resolução da tela virtual
            options.addArguments("--window-size=1920,1080");
        }

        // Cria e retorna o navegador
        return new ChromeDriver(options);
    }
}
