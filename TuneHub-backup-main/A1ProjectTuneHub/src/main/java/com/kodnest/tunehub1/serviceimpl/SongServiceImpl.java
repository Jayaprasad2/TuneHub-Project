package com.kodnest.tunehub1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub1.entity.Song;
import com.kodnest.tunehub1.repository.SongRepository;
import com.kodnest.tunehub1.service.SongService;

@Service
public class SongServiceImpl implements SongService{

	@Autowired
	SongRepository songRepository;

	@Override
	public void addSong(Song song) {
		songRepository.save(song);

	}

	@Override
	public List<Song> fetchAllSongs() {
		List<Song> songs = songRepository.findAll();
		return songs;
	}

	@Override
	public boolean songExists(String name) {
		Song song = songRepository.findByName(name);
		if(song==null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public void updateSong(Song s) {
		songRepository.save(s);
	}

}
