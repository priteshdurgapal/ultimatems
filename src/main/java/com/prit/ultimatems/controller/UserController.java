package com.prit.ultimatems.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prit.ultimatems.dto.User;
import com.prit.ultimatems.service.UserService;

@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping(value = "/add/user", produces = { APPLICATION_JSON_VALUE })
	ResponseEntity<User> addUser(@RequestBody User userRequest,
			@RequestHeader("Allowed") String allowedFlag){
		return ResponseEntity.ok(userService.addUser(userRequest));
		
	}
	
}
