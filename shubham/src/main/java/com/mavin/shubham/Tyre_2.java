package com.mavin.shubham;

import org.springframework.stereotype.Component;

@Component
public class Tyre_2 {
    private String brand;
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	  @Override public String toString() { return "Its working"; }
	
}