package com.kodnest.tunehub1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub1.entity.Song;

public interface SongRepository 
extends JpaRepository<Song, Integer>{

	public Song findByName(String name);

}
