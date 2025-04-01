package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class GoogleTradutor {

    public static String obterTraducao(String texto) {
        String idiomaOrigem = "auto";
        String idiomaDestino = "pt";

        try {
            String url = "https://translate.googleapis.com/translate_a/single"
                    + "?client=gtx"
                    + "&sl=" + idiomaOrigem
                    + "&tl=" + idiomaDestino
                    + "&dt=t&q=" + URLEncoder.encode(texto, StandardCharsets.UTF_8);

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return parseTranslatedText(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Erro ao traduzir o texto.";
        }
    }

    private static String parseTranslatedText(String responseBody) {
        try {
            return responseBody.split("\"")[1];
        } catch (Exception e) {
            return "Erro ao processar a resposta.";
        }
    }
}
