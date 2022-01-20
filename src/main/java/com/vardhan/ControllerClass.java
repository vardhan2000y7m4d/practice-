package com.vardhan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerClass {
	
	@Value("${app.Hello}")
	private String hello;
	
	@RequestMapping("/hello-world")
	public String methosHelloworld() {
		return hello;
	}
	
	@RequestMapping("/welcome")
	public String welcomeMeyhos() {
		return "welcome vardhan";
	}
	
	

}
