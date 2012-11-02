package me.m1key.audiolicious.cloud.repositories;

import me.m1key.audiolicious.cloud.entities.Song;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {

}
