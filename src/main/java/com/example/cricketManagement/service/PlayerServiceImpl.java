package com.example.cricketManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cricketManagement.dto.PlayerDto;
import com.example.cricketManagement.entity.Player;
import com.example.cricketManagement.exception.PlayerNotFoundException;
import com.example.cricketManagement.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements IPlayerService{

	
	@Autowired
	PlayerRepository repo;
	
	@Override
	public List<Player> getAllPlayers() {
		return repo.findAll();
	}

	@Override
	public Player addPlayer(PlayerDto dto) {
		
		Player player=new Player();
		
		player.setPlayerName(dto.getPlayerName());
		player.setJerseyNumber(dto.getJerseyNumber());
		player.setRole(dto.getRole());
		player.setTotalMatches(dto.getTotalMatches());
		player.setTeamName(dto.getTeamName());
		player.setCountryName(dto.getCountryName());
		player.setDescription(dto.getDescription());
		
		return repo.save(player);
	}

	@Override
	public Player getPlayerById(int playerId) {
	return repo.findById(playerId).orElseThrow(()->new PlayerNotFoundException("Player not found"));
	}

	@Override
	public Player updatePlayer(int playerId,PlayerDto dto) {
        
		Player player = repo.findById(playerId)
                .orElseThrow(() ->
                        new PlayerNotFoundException(
                                "Player not found"));

        player.setPlayerName(dto.getPlayerName());
        player.setJerseyNumber(dto.getJerseyNumber());
        player.setRole(dto.getRole());
        player.setTotalMatches(dto.getTotalMatches());
        player.setTeamName(dto.getTeamName());
        player.setCountryName(dto.getCountryName());
        player.setDescription(dto.getDescription());

        return repo.save(player);
	}

	@Override
	public void deleteById(int playerId) {
		Player player = repo.findById(playerId)
	            .orElseThrow(() ->
	                new PlayerNotFoundException("Player not found"));
		
	}

}
