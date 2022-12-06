package com.xworkz.hogeakusko.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.hogeakusko.repository.ATMRepository;
import com.xworkz.hogeakusko.repository.ATMRepositoryImpl;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {
//@Bean
//public ATMRepository atmRepository() {
//	System.out.println("first nande");
//	return new ATMRepositoryImpl();
//}
@Bean
public ATMRepository atmRepository1() {
	System.out.println("edu ade");
	return new ATMRepositoryImpl();
}
}
