package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Player;
import com.exam.repository.PlayerRepository;


@RestController
public class PlayerController {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@GetMapping("/all")
	public List<Player>getAllPlayer(){
		return playerRepository.findAll();
	}
	
	@PostMapping("/save")
	public Player savePlayer(@RequestBody Player player) {
		return playerRepository.save(player);
	}
	
	

	

}
