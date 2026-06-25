package browser;

// Importa a interface principal do Selenium
import org.openqa.selenium.WebDriver;

// Importa o navegador Chrome
import org.openqa.selenium.chrome.ChromeDriver;

// Permite configurar opções do Chrome
import org.openqa.selenium.chrome.ChromeOptions;

// Faz download automático do ChromeDriver compatível com o navegador
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

    // Método principal da fábrica
    // Recebe qual navegador abrir e se será executado em modo headless
    public static WebDriver createBrowser(String browser, boolean headless) {

        // Verifica se o navegador informado é Chrome
        if (browser.equalsIgnoreCase("chrome")) {

            // Chama o método responsável por configurar e abrir o Chrome
            return createChrome(headless);
        }

        // Caso o navegador informado não seja suportado
        throw new RuntimeException("Browser não suportado: " + browser);
    }

    // Método responsável por configurar e abrir o navegador Chrome
    private static WebDriver createChrome(boolean headless) {

        // Faz o download/configuração automática do ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Cria o objeto de configuração do Chrome
        ChromeOptions options = new ChromeOptions();

        // Argumento comum para evitar problemas de origem remota no Chrome
        options.addArguments("--remote-allow-origins=*");

        // Verifica se a execução está acontecendo no GitHub Actions
        if (System.getenv("GITHUB_ACTIONS") != null) {

            // No GitHub Actions não existe interface gráfica, por isso usamos headless
            options.addArguments("--headless=new");

            // Argumentos recomendados para execução em ambiente Linux/CI
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            // Define uma resolução fixa para a execução headless
            options.addArguments("--window-size=1920,1080");

        } else {

            // Execução local com navegador visível e maximizado
            options.addArguments("--start-maximized");

            // Caso o properties esteja configurado com headless=true
            if (headless) {

                // Executa o Chrome sem abrir a janela visualmente
                options.addArguments("--headless=new");

                // Define resolução fixa para execução headless local
                options.addArguments("--window-size=1920,1080");
            }
        }

        // Cria e retorna uma nova instância do navegador Chrome
        return new ChromeDriver(options);
    }
}