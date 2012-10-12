package me.m1key.audiolicious.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	private static final Logger log = LoggerFactory
			.getLogger(WelcomeController.class);

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String handleRequest() {
		log.info("Welcome called");
		return "welcome";
	}

}
