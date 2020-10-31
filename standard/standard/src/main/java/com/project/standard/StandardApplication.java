package com.project.standard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;//db연동 안할 때
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration; //db연동 안할 때

@SpringBootApplication
public class StandardApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardApplication.class, args);
	}

}
