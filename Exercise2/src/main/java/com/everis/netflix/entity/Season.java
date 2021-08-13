package com.everis.netflix.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "season")
public class Season implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private Integer number;

	private String name;

	@ManyToOne
	@JoinColumn(name="tvshow_id")
	private TvShow tvshows;
	
	@OneToMany(mappedBy="seasons")
	private List<Chapter> chapter = new ArrayList<>();
	
	public Season() {
		
	}



	



	public Season(Long id, Integer number, String name, TvShow tvshows, List<Chapter> chapter) {
		
		this.id = id;
		this.number = number;
		this.name = name;
		this.tvshows = tvshows;
		this.chapter = chapter;
	}







	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Integer getNumber() {
		return number;
	}



	public void setNumber(Integer number) {
		this.number = number;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	

	public TvShow getTvshow() {
		return tvshows;
	}



	public void setTvshow(TvShow tvshow) {
		this.tvshows = tvshow;
	}



	public List<Chapter> getChapter() {
		return chapter;
	}



	public void setChapter(List<Chapter> chapter) {
		this.chapter = chapter;
	}



	@Override
	public String toString() {
		return "Season [id=" + id + ", number=" + number + ", name=" + name + ", tvshow=" + tvshows + ", chapter="
				+ chapter + "]";
	}




	
	
	
	
}
