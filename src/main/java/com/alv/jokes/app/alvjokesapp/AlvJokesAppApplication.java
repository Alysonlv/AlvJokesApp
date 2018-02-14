package com.alv.jokes.app.alvjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:chuck-config.xml") // To use the XML configuration file
public class AlvJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlvJokesAppApplication.class, args);
	}
}
