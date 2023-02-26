package com.SpringBoot.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	// /courses (to hit the url /currency-configuration use @requestmapping)
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retriveAllcourses(){
		return configuration;
	}
}
