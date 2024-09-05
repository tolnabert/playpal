package org.petproject.playpal.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GameDTO(@JsonProperty("appid") int appId,
                      @JsonProperty("playtime_forever") int playtimeForever,
                      @JsonProperty("playtime_windows_forever") int playtimeWindowsForever,
                      @JsonProperty("playtime_mac_forever") int playtimeMacForever,
                      @JsonProperty("playtime_linux_forever") int playtimeLinuxForever,
                      @JsonProperty("playtime_deck_forever") int playtimeDeckForever,
                      @JsonProperty("rtime_last_played") int rtimeLastPlayed,
                      @JsonProperty("playtime_disconnected") int playtimeDisconnected) {
}
