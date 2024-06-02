package com.mavin.shubham;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	String name;
	int speed;
   public void drive() {
	System.out.println("Bike is moving fast by "+name +" speed "+speed);
}
	public String getName() {
			return name;
		}
	public int getSpeed() {
		return speed;
	}
	public void setName(String name) {
		this.name = name;
	}
public void setSpeed(int speed) {
	this.speed = speed;
}
}
