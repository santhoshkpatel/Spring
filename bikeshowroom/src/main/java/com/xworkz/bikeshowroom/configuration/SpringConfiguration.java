package com.xworkz.bikeshowroom.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")

public class SpringConfiguration {
public SpringConfiguration() {
System.out.println("spring configuration setup done");
}
	
}
