package com.cricket.teammanagement.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {
    private Integer playerId;
    @NotBlank(message = "Player Name is required")
    private String playerName;
    @NotNull(message = "Jersey Number is required")
    private Integer jerseyNumber;
    @NotBlank(message = "Role is required")
    private String role;
    @Min(value = 0, message = "Matches cannot be negative")
    private Integer totalMatches;
    @NotBlank(message = "Team Name is required")
    private String teamName;
    @NotBlank(message = "Country Name is required")
    private String countryName;
    private String description;
}