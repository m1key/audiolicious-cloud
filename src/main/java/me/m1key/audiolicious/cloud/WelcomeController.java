package me.m1key.audiolicious.cloud;

import me.m1key.audiolicious.cloud.repositories.SongRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@Autowired
	private SongRepository songRepository;

	private static final Logger log = LoggerFactory
			.getLogger(WelcomeController.class);

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String handleRequest() {
		log.info("Welcome called");
		log.info("Found [{}] songs.", songRepository.count());
		return "welcome";
	}

}
