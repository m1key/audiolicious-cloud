package me.m1key.audiolicious.cloud;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/audiolicious-servlet.xml" })
public class WelcomeControllerViaServletTest {

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.xmlConfigSetup(
				"classpath:/audiolicious-servlet.xml").build();
	}

	@Test
	public void testGetBooks() throws Exception {
		mockMvc.perform(get("/home")).andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello!\n")));
	}

}
