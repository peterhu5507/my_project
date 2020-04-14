package com.example.Springboottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import ccbs.utility.* ;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class Springboottest1Application {
	//@GetMapping("user")
	//@ResponseBody
//	public String user(String name) {
//		Utility ut = new Utility() ;
//		return String.format("Hello " + name + " Today is " + ut.GetDatefromDATE());
		//http://localhost:4000/user?name=test
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Welcome to CCBS";
	}

	
	 public static void main(String[] args) {
		 SpringApplication.run(Springboottest1Application.class, args);
		 //SpringApplication.run(userController.class, args);
	 }
}


