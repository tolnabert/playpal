package org.petproject.playpal.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GameLibraryResponse(GameLibrary response) {
}
