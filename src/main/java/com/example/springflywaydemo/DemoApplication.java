package com.example.springflywaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public FlywayMigrationStrategy cleanMigrateStrategy() {
	    return flyway -> {
	        flyway.repair();
	        flyway.migrate();
	    };
	}

}
