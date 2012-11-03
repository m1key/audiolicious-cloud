package me.m1key.audiolicious.cloud.repositories;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import me.m1key.audiolicious.cloud.entities.Song;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/audiolicious-servlet.xml" })
public class SongRepositoryTest {

	@Autowired
	private SongRepository songRepository;

	@Before
	public void setup() {
		songRepository.deleteAll();
	}

	@Test
	public void testRepositoryNotNull() {
		// Testing Spring & MongoDb, really...
		assertThat(songRepository, notNullValue());
	}

	@Test
	public void testSaveAndRetrieve() {
		assertThat(songRepository.count(), equalTo(0L));

		Song song = new Song("Come Together", "Greatest Hits", "Tina Turner",
				"abc");
		songRepository.save(song);

		assertThat(songRepository.count(), equalTo(1L));
	}

	@After
	public void cleanUp() {
		songRepository.deleteAll();
	}

}
