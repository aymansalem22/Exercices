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

import com.everis.netflix.entity.Chapter;

import com.everis.netflix.repository.ChapterRespository;

@RestController
public class ChapterController {

	@Autowired
	private ChapterRespository chapterRepo;
	
	@GetMapping("/chapters")
	public  List<Chapter> listAll(){
		return chapterRepo.findAll();}
	
	@GetMapping("/chapters/{id}")
	public Chapter listChapter(@PathVariable Long id) {
		return chapterRepo.findById(id).get();
	}
	
	@PostMapping("/chapters")
	public Chapter newChapter(@RequestBody Chapter chapter) {
		return chapterRepo.save(chapter);
		
	}
	
	@PutMapping("/chapters")
	public Chapter editChapter(@RequestBody Chapter chapter) {
		return chapterRepo.save(chapter);
	}
	
	@DeleteMapping("/chapters/{id}")
	public void deleteChapter(@PathVariable Long id) {
		chapterRepo.deleteById(id);
	}
	
	@DeleteMapping("/chapters")
	public void deleteChapter() {
		chapterRepo.deleteAll();
	}
}
