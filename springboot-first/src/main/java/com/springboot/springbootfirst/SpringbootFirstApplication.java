package com.springboot.springbootfirst;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstApplication {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SpringbootFirstApplication.class);

	public static void main(String[] args) {
		 logger.info("it is continuous integration");
	      
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
		SpringApplication.run(SpringbootFirstApplication.class, args);
	}

}
