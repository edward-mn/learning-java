package br.com.example.screenSounds.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SearchGPT {
    private static final WebClient webClient = WebClient.builder()
            .baseUrl("https://api.deezer.com")
            .build();

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Mono<String> getInformation(String artistName) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/search/artist")
                        .queryParam("q", artistName)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .flatMap(response -> {
                    try {
                        JsonNode root = objectMapper.readTree(response);
                        JsonNode data = root.path("data");
                        if (data.isArray() && data.size() > 0) {
                            JsonNode firstArtist = data.get(0);
                            String name = firstArtist.path("name").asText();
                            String link = firstArtist.path("link").asText();
                            return Mono.just("Artist: " + name + " | Link: " + link);
                        } else {
                            return Mono.just("No artist found with the name: " + artistName);
                        }
                    } catch (Exception e) {
                        return Mono.error(new RuntimeException("Error parsing JSON", e));
                    }
                });
    }
}