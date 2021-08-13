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

import com.everis.netflix.entity.Season;
import com.everis.netflix.repository.SeasonRespository;

@RestController
public class SeasonController {

	@Autowired
	private SeasonRespository seasonRepo;
	
	@GetMapping("/seasons")
	public  List<Season> listAll(){
		return seasonRepo.findAll();}
	
	@GetMapping("/seasons/{id}")
	public Season listSeason(@PathVariable Long id) {
		return seasonRepo.findById(id).get();
	}
	
	@PostMapping("/seasons")
	public Season newSeason(@RequestBody Season Season) {
		return seasonRepo.save(Season);
		
	}
	
	@PutMapping("/seasons")
	public Season editSeason(@RequestBody Season Season) {
		return seasonRepo.save(Season);
	}
	
	@DeleteMapping("/seasons/{id}")
	public void deleteSeason(@PathVariable Long id) {
		seasonRepo.deleteById(id);
	}
	
	@DeleteMapping("/seasons")
	public void deleteSeason() {
		seasonRepo.deleteAll();
	}
}
