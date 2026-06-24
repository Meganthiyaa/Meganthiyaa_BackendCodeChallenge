package com.example.cricketManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cricketManagement.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{
	
	List<Player> findByTotalMatchesGreaterThan(int totalMatches);
}
