package org.petproject.playpal.controller;

import org.petproject.playpal.model.dto.GameDTO;
import org.petproject.playpal.model.dto.GameLibrary;
import org.petproject.playpal.model.dto.GameLibraryResponse;
import org.petproject.playpal.service.SteamService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class SteamController {
    private final SteamService steamService;

    public SteamController(SteamService steamService) {
        this.steamService = steamService;
    }

    @GetMapping
    @RequestMapping("/library/{steamId}")
    public GameLibraryResponse getGamesLibrary(@PathVariable String steamId) {
        return steamService.getGamesLibrary(steamId);
    }
}
