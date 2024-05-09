package com.kodnest.tunehub1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub1.entity.Playlist;

public interface PlaylistRepository 
	extends JpaRepository<Playlist, Integer>{

}
