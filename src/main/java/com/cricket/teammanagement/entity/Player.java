package com.cricket.teammanagement.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "players")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;
    private String playerName;
    private Integer jerseyNumber;
    private String role;
    private Integer totalMatches;
    private String teamName;
    private String countryName;
    private String description;
}
