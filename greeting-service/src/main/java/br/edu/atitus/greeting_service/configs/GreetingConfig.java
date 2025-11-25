package br.edu.atitus.greeting_service.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties ("greeting-service")
public class GreetingConfig {
	
	private String greeting;
	private String defaultname;
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getDefaultname() {
		return defaultname;
	}
	public void setDefaultname(String defaultname) {
		this.defaultname = defaultname;
	}

}
