package org.petproject.playpal.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GameLibrary(@JsonProperty("game_count") int gameCount,
                          @JsonProperty("games") GameDTO[] games) {
}
