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

import com.everis.netflix.entity.Category;
import com.everis.netflix.repository.CategoryRespository;

@RestController
public class CategoryController {

	@Autowired
	private CategoryRespository categoryRepo;
	
	@GetMapping("/categories")
	public  List<Category> listAll(){
		return categoryRepo.findAll();}
	
	@GetMapping("/categories/{id}")
	public Category listCategory(@PathVariable Long id) {
		return categoryRepo.findById(id).get();
	}
	
	@PostMapping("/categories")
	public Category newCategory(@RequestBody Category category) {
		return categoryRepo.save(category);
		
	}
	
	@PutMapping("/categories")
	public Category editCategory(@RequestBody Category category) {
		return categoryRepo.save(category);
	}
	
	@DeleteMapping("/categories/{id}")
	public void deleteCategory(@PathVariable Long id) {
		categoryRepo.deleteById(id);
	}
	
	@DeleteMapping("/categories")
	public void deleteCategory() {
		categoryRepo.deleteAll();
	}
	
	
	
	
	
}
