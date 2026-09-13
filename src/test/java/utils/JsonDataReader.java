package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public final class JsonDataReader {

    private JsonDataReader() {
        // Impede a criação de objetos desta classe utilitária.
    }

    public static String obterValor(
            String caminhoArquivo,
            String grupo,
            String campo) {

        // Localiza a massa dentro de src/test/resources.
        InputStream arquivo = JsonDataReader.class
                .getClassLoader()
                .getResourceAsStream(caminhoArquivo);

        if (arquivo == null) {
            throw new IllegalArgumentException(
                    "Arquivo de massa não encontrado: " + caminhoArquivo);
        }

        // Lê o JSON e fecha o arquivo automaticamente ao finalizar.
        try (Reader reader = new InputStreamReader(
                arquivo, StandardCharsets.UTF_8)) {

            JsonObject dados = JsonParser.parseReader(reader)
                    .getAsJsonObject();

            JsonElement grupoEncontrado = dados.get(grupo);

            if (grupoEncontrado == null
                    || !grupoEncontrado.isJsonObject()) {
                throw new IllegalArgumentException(
                        "Grupo não encontrado ou inválido: " + grupo);
            }

            JsonElement valor = grupoEncontrado
                    .getAsJsonObject()
                    .get(campo);

            if (valor == null
                    || !valor.isJsonPrimitive()
                    || !valor.getAsJsonPrimitive().isString()) {
                throw new IllegalArgumentException(
                        "Campo não encontrado ou não textual: "
                                + grupo + "." + campo);
            }

            return valor.getAsString();

        } catch (IOException e) {
            throw new IllegalStateException(
                    "Erro ao ler a massa: " + caminhoArquivo, e);
        }
    }
}
