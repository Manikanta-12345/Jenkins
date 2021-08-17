package com.tech.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootJenkinsPipeLineApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("started...");
		SpringApplication.run(BootJenkinsPipeLineApplication.class, args);
	}

}
