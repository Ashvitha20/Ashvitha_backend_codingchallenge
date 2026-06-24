package com.cricket.teammanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.teammanagement.entity.Player;

public interface PlayerRepository
        extends JpaRepository<Player, Integer> {

}