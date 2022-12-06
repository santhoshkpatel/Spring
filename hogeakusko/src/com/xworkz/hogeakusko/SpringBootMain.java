package com.xworkz.hogeakusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.hogeakusko.configuration.SpringConfiguration;
import com.xworkz.hogeakusko.service.ATMService;

public class SpringBootMain {

	public static void main(String[] args) {
		ApplicationContext ref = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ATMService bean = ref.getBean(ATMService.class);
		bean.validateAndSave(null);

	}

}
