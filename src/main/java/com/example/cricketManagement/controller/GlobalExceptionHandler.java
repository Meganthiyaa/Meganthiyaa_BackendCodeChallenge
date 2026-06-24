package com.example.cricketManagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.cricketManagement.exception.PlayerNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(PlayerNotFoundException.class)
	@ResponseStatus(
	        reason = "Player Not Found",
	        code = HttpStatus.NOT_FOUND)
	    public void handlePlayerException() {

	    }

}
