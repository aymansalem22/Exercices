package com.everis.netflix.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.everis.netflix.entity.TvShow;
import com.everis.netflix.repository.TvShowRespository;

@RestController
public class TvShowController {

	@Autowired
	private TvShowRespository tvshowRepo;
	
	@GetMapping("/tvshows")
	public  List<TvShow> listAll(){
		return tvshowRepo.findAll();}
	
	@GetMapping("/tvshows/{id}")
	public TvShow listTvShow(@PathVariable Long id) {
		return tvshowRepo.findById(id).get();
	}
	
	@PostMapping("/tvshows")
	public TvShow newTvShow(@RequestBody TvShow tvshow) {
		return tvshowRepo.save(tvshow);
		
	}
	
	@PutMapping("/tvshows")
	public TvShow editTvShow(@RequestBody TvShow tvshow) {
		return tvshowRepo.save(tvshow);
	}
	
	@DeleteMapping("/tvshows/{id}")
	public void deleteTvShow(@PathVariable Long id) {
		tvshowRepo.deleteById(id);
	}
	
	@DeleteMapping("/tvshows")
	public void deleteTvShow() {
		tvshowRepo.deleteAll();
	}
	
}
