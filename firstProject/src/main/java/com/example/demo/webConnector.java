package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class webConnector {
	@GetMapping("/")
     public String index() {
    	 return "index";
     }
}
