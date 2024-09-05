package org.petproject.playpal.service;

import org.petproject.playpal.model.dto.GameDTO;
import org.petproject.playpal.model.dto.GameLibrary;
import org.petproject.playpal.model.dto.GameLibraryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class SteamService {

    @Value("${steam.api.key}")
    private String steamApiKey;
    private final WebClient webClient;

    @Autowired
    public SteamService(WebClient webClient) {
        this.webClient = webClient;
    }

    public GameLibraryResponse getGamesLibrary(String steamId) {
        String url = buildUrl(steamId);
        return fetchLibrary(url);
    }

    private GameLibraryResponse fetchLibrary(String url) {
        Mono<GameLibraryResponse> response = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(GameLibraryResponse.class);
        return response.block();
    }

    private String buildUrl(String profileId) {
        return String.format(
                "https://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key=%s&steamid=%s&format=json",
                steamApiKey,
                profileId
        );
    }
}
