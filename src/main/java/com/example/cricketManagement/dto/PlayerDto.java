package com.example.cricketManagement.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class PlayerDto {
	
	@Min(value = 101)
	@Max(value = 999)
	private int  playerId;
	
	@NotBlank
	private String playerName;
	
	@NotNull
	private int jerseyNumber;
	
	 @Pattern(
		        regexp = "Batsman|Bowler|Keeper|All Rounder",
		        message = "Role must be Batsman, Bowler, Keeper or All Rounder"
		    )
	private String role;
	
	@NotNull
	private int totalMatches;
	
	@NotBlank
	private String teamName;
	@NotBlank
	private String countryName;
	@NotBlank
	private String description;
	
	
	public PlayerDto() {
		super();
	}
	
	
	public PlayerDto(@Min(101) @Max(999) int playerId, @NotBlank String playerName, @NotNull int jerseyNumber,
			@NotBlank String role, @NotNull int totalMatches, @NotBlank String teamName, @NotBlank String countryName,
			@NotBlank String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.description = description;
	}
	
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "PlayerDto [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", countryName="
				+ countryName + ", description=" + description + "]";
	}
	
}
