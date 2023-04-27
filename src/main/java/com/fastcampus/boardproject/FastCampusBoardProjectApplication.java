package com.fastcampus.boardproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusBoardProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastCampusBoardProjectApplication.class, args);
	}

}
