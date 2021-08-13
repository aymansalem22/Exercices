package com.everis.netflix.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name="category")
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	
	@ManyToMany(mappedBy = "categories")
	@JsonIgnore
	private List<TvShow> TvShows = new ArrayList<TvShow>();
	
	
	public Category() {
	
	}

	public Category( String name) {
		
		this.name = name;
		
	}

	public Category(String name, List<TvShow> tvShows) {
		
		this.name = name;
		TvShows = tvShows;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public List<TvShow> getTvShows() {
		return TvShows;
	}



	public void setTvShows(List<TvShow> tvShows) {
		TvShows = tvShows;
	}



	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", TvShows=" + TvShows + "]";
	}
	
	

}
