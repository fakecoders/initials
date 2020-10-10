package com.fakecoders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitialsApplication implements ApplicationRunner{
	private static final Logger logger = LogManager.getLogger(InitialsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(InitialsApplication.class, args);
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		 * logger.debug("Debugging log"); logger.info("Info log");
		 * logger.warn("Hey, This is a warning!");
		 * logger.error("Oops! We have an Error. OK");
		 * logger.fatal("Damn! Fatal error. Please fix me.");
		 */
		
	}

}
