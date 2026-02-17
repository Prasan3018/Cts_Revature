package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class OrderController {

	private final OrderService orderService;
	
	public OrderController(OrderService service) {this.orderService = service;}
	
	@PostMapping
	public ResponseEntity<Order> place(@RequestBody @Valid CreateOrderRequest req,
			Authentication auth){
		Order created = service.placeOrder(auth.getName(), req);
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}
}
