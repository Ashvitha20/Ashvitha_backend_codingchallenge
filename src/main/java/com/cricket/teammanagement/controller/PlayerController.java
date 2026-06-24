package com.cricket.teammanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cricket.teammanagement.dto.PlayerDTO;
import com.cricket.teammanagement.entity.Player;
import com.cricket.teammanagement.service.PlayerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;
    @PostMapping
    public Player createPlayer(
            @Valid @RequestBody PlayerDTO dto) {

        return playerService.createPlayer(dto);
    }

    @GetMapping
    public List<Player> getAllPlayers() {

        return playerService.getAllPlayers();
    }

    @GetMapping("/{playerId}")
    public Player getPlayerById(
            @PathVariable Integer playerId) {

        return playerService.getPlayerById(playerId);
    }

    @PutMapping("/{playerId}")
    public Player updatePlayer(
            @PathVariable Integer playerId,
            @Valid @RequestBody PlayerDTO dto) {

        return playerService.updatePlayer(playerId, dto);
    }
    @DeleteMapping("/{playerId}")
    public String deletePlayer(
            @PathVariable Integer playerId) {

        return playerService.deletePlayer(playerId);
    }
}