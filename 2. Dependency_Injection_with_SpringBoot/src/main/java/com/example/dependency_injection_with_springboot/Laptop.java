package com.example.dependency_injection_with_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	private Computer computer;
	
	public void display() {
		computer.display();
		System.out.println("display() method of Laptop Bean!");
	}
}
