package com.cybertek;

import com.cybertek.interfaces.Course;
import com.cybertek.services.Java;
import com.cybertek.services.Selenium;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {

	public static void main(String[] args) {
		  ApplicationContext container = SpringApplication.run(Spring07SpringBootDemoApplication.class, args);
		Course java = container.getBean("java", Java.class);
		Course selenium = container.getBean("selenium", Selenium.class);

		java.getTeachingHours();
		selenium.getTeachingHours();
	}

}
