package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Classe responsável por carregar e disponibilizar
 * as configurações do ambiente de execução.
 *
 * Ambientes suportados:
 * - qa
 * - uat
 * - prod
 *
 * O ambiente é definido através da propriedade:
 *
 * -Denv=qa
 * -Denv=uat
 * -Denv=prod
 *
 * Caso nenhum ambiente seja informado,
 * o sistema utilizará QA por padrão.
 */
public class ConfigReader {

    /**
     * Objeto responsável por armazenar todas as propriedades
     * carregadas do arquivo application-<env>.properties.
     */
    private static final Properties properties = new Properties();

    /**
     * Bloco estático executado uma única vez
     * quando a classe é carregada.
     *
     * Responsabilidades:
     * - Identificar o ambiente
     * - Localizar o arquivo correspondente
     * - Carregar as propriedades em memória
     */
    static {

        /**
         * Obtém o ambiente informado na execução.
         *
         * Exemplo:
         * mvn clean test -Denv=uat
         *
         * Caso não exista:
         * utiliza "qa" como padrão.
         */
        String ambiente = System.getProperty("env", "qa");

        /**
         * Monta dinamicamente o nome do arquivo.
         *
         * Exemplo:
         * application-qa.properties
         * application-uat.properties
         * application-prod.properties
         */
        String arquivo = "application-" + ambiente + ".properties";

        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream(arquivo)) {

            /**
             * Valida se o arquivo foi encontrado.
             */
            if (input == null) {
                throw new RuntimeException(
                        "Arquivo de configuração não encontrado: " + arquivo);
            }

            /**
             * Carrega todas as propriedades em memória.
             */
            properties.load(input);

        } catch (IOException e) {

            /**
             * Lança erro caso ocorra falha durante a leitura.
             */
            throw new RuntimeException(
                    "Erro ao carregar arquivo de configuração: " + arquivo, e);
        }
    }

    /**
     * Retorna a URL base da aplicação.
     */
    public static String getUrlBase() {
        return properties.getProperty("urlBase");
    }

    /**
     * Retorna o navegador configurado.
     *
     * Exemplo:
     * chrome
     */
    public static String getBrowser() {
        return properties.getProperty("browser");
    }

    /**
     * Retorna se a execução será Headless.
     *
     * true  -> sem interface gráfica
     * false -> navegador visível
     */
    public static boolean isHeadless() {
        return Boolean.parseBoolean(properties.getProperty("headless"));
    }

    /**
     * Retorna o timeout padrão da aplicação.
     */
    public static int getTimeout() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }

    /**
     * Retorna o usuário configurado para o ambiente.
     */
    public static String getUsername() {
        return properties.getProperty("username");
    }

    /**
     * Retorna a senha configurada para o ambiente.
     */
    public static String getPassword() {
        return properties.getProperty("password");
    }
}