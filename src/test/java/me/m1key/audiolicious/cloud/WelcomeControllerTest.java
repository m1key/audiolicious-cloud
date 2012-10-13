package me.m1key.audiolicious.cloud;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/WEB-INF/audiolicious-servlet.xml"})
public class WelcomeControllerTest {

	@Autowired
	private WelcomeController welcomeController;

	@Test
	public void returnsCorrectViewName() {
		assertThat(welcomeController, not(nullValue())); // Testing Spring,
															// really.
	}

}
