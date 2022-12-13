package com.xworkz.bikeshowroom.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/send")
public class BikeShowRoomController {
public BikeShowRoomController() {
System.out.println("bike show room controller working");	// 
}
@PostMapping
	public String onSend() {
		System.out.println("on send method working");
		return "index.jsp";
				
	}
}
