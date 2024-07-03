package com.example.dependency_injection_with_springboot;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	public Computer() {
		System.out.println("Constructor of Computer Bean!");
	}
	
	public void display() {
		System.out.println("display() method of Computer Bean!");
	}
}
