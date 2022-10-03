package com.kenya.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	
	@RequestMapping("/")
	public String home() {
		return "Hello Human";
	}
	
	// ===== QUERY PARAMETERS =======
	@RequestMapping("/name")
		public String name(@RequestParam( value="name") String addName, 
						   @RequestParam ( value ="last_name") String lastName) {
			return " Hello " + addName + " " + lastName ;
		}
	

}
