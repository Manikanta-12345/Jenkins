package com.tech.apps;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController{

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomeJenkins() {
		return "Welcome To SpringBoot Jenkins PipeLine WebHook";
	}
}
