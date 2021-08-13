package com.everis.netflix;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.netflix.entity.Category;
import com.everis.netflix.entity.TvShow;
import com.everis.netflix.repository.CategoryRespository;
import com.everis.netflix.repository.TvShowRespository;

import java.util.List;

@SpringBootApplication
public class NetflixMovieApplication implements CommandLineRunner{

	@Autowired
	private CategoryRespository categoryRepo;
	
	@Autowired
	private TvShowRespository tvshowRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(NetflixMovieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Category category1=new Category("Action");	categoryRepo.save(category1);
	List<Category> categories=Arrays.asList(category1);
	TvShow tvshow1=new TvShow("test1", "one man has a wife", " his woman travel a lot", "2002", 16, "available three weeks"); 
	tvshow1.setCategories(categories);
	TvShow tvshow2=new TvShow("test2", "one woman has a husband", " her man travel another destions", "2005", 18, "during two week"); 
	tvshow2.setCategories(categories);
	
	List<TvShow> tvshows=Arrays.asList(tvshow1,tvshow2);
		
	tvshowRepo.saveAll(tvshows);
	
	}

}
