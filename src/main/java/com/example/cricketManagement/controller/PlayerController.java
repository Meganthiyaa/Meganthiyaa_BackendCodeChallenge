package com.example.cricketManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cricketManagement.dto.PlayerDto;
import com.example.cricketManagement.entity.Player;
import com.example.cricketManagement.service.IPlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	IPlayerService service;
	
	@GetMapping
	public List<Player> getAllPlayers(){
		return service.getAllPlayers();
	}
	
	@PostMapping
	public Player addPlayer(@RequestBody PlayerDto dto) {
		return service.addPlayer(dto);
	}
	
	@GetMapping("/{playerId}")
	public Player getPlayerById(@PathVariable int playerId) {
		return service.getPlayerById(playerId);
	}
	
	 @PutMapping("/{playerId}")
	    public Player updatePlayer(@PathVariable int playerId,
	                               @RequestBody PlayerDto dto) {

	        return service.updatePlayer(playerId, dto);
	    }
	@DeleteMapping("/{playerId}")
	public String deleteById(@PathVariable int playerId) {
		service.deleteById(playerId);
		return "Player record deleted successfully";
	}
	
	@GetMapping("/matches/{totalMatches}")
	public List<Player> getPlayerByMatches(@PathVariable int totalMatches){
		return service.getPlayerByMatches(totalMatches);
	}
}
