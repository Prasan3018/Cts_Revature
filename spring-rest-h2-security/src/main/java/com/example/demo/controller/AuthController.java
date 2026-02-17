package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public class AuthController {
	
	private final AuthService authService;
	
	public AuthController(AuthService authService) {this.authService = authService;}
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody @Valid RegisterRequest req){
		authService.register(req);
		return ResponseEntity.status(HttpStatus.CREATED).body(java.util.Map.of("message","User registered successfully")
				);
	}
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(@RequestBody @Valid LoginRequest req){
		String token = authService.login(req);
		return ResponseEntity.ok(new LoginResponse(token));
	}
}
