package com.cricket.teammanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.teammanagement.dto.PlayerDTO;
import com.cricket.teammanagement.entity.Player;
import com.cricket.teammanagement.exception.ResourceNotFoundException;
import com.cricket.teammanagement.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player createPlayer(PlayerDTO dto) {

        Player player = new Player();

        player.setPlayerName(dto.getPlayerName());
        player.setJerseyNumber(dto.getJerseyNumber());
        player.setRole(dto.getRole());
        player.setTotalMatches(dto.getTotalMatches());
        player.setTeamName(dto.getTeamName());
        player.setCountryName(dto.getCountryName());
        player.setDescription(dto.getDescription());

        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(Integer playerId) {

        Player player = playerRepository.findById(playerId).orElse(null);

        if(player == null) {

            throw new ResourceNotFoundException(
                    "Player not found with id : " + playerId);
        }

        return player;
    }

    @Override
    public List<Player> getAllPlayers() {

        return playerRepository.findAll();
    }

    @Override
    public Player updatePlayer(Integer playerId, PlayerDTO dto) {

        Player existingPlayer = playerRepository.findById(playerId).orElse(null);

        if(existingPlayer == null) {

            throw new ResourceNotFoundException(
                    "Player not found with id : " + playerId);
        }

        existingPlayer.setPlayerName(dto.getPlayerName());
        existingPlayer.setJerseyNumber(dto.getJerseyNumber());
        existingPlayer.setRole(dto.getRole());
        existingPlayer.setTotalMatches(dto.getTotalMatches());
        existingPlayer.setTeamName(dto.getTeamName());
        existingPlayer.setCountryName(dto.getCountryName());
        existingPlayer.setDescription(dto.getDescription());

        return playerRepository.save(existingPlayer);
    }

    @Override
    public String deletePlayer(Integer playerId) {

        Player player =
                playerRepository.findById(playerId).orElse(null);

        if(player == null) {

            throw new ResourceNotFoundException(
                    "Player not found with id : " + playerId);
        }

        playerRepository.delete(player);

        return "Player Deleted Successfully";
    }
}