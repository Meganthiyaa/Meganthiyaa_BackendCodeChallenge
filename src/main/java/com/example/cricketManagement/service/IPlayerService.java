package com.example.cricketManagement.service;

import java.util.List;

import com.example.cricketManagement.dto.PlayerDto;
import com.example.cricketManagement.entity.Player;

public interface IPlayerService {
	
	public List<Player> getAllPlayers();
	
	public Player addPlayer(PlayerDto dto);
	
	public Player getPlayerById(int playerId);
	
	public Player updatePlayer(int playerId,PlayerDto dto);
	
	public void deleteById(int playerId);
}
