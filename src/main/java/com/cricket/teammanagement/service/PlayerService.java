package com.cricket.teammanagement.service;
import java.util.List;

import com.cricket.teammanagement.dto.PlayerDTO;
import com.cricket.teammanagement.entity.Player;
public interface PlayerService {
	Player createPlayer(PlayerDTO dto);
    Player getPlayerById(Integer playerId);
    List<Player> getAllPlayers();
    Player updatePlayer(Integer playerId, PlayerDTO dto);
    String deletePlayer(Integer playerId);
}
