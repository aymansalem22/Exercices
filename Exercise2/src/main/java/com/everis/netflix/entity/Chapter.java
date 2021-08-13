package com.everis.netflix.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "chapter")
public class Chapter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private Integer number;

	private String name;
	
	private String duration;

	@ManyToOne
	@JoinColumn(name="season_id")
	private Season seasons;

	
	
	
	
	
	
	public Chapter() {
		
	}



	public Chapter(Long id, Integer number, String name, String duration, Season season) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.duration = duration;
		this.seasons = season;
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Season getSeason() {
		return seasons;
	}

	public void setSeason(Season season) {
		this.seasons = season;
	}



	@Override
	public String toString() {
		return "Chapter [id=" + id + ", number=" + number + ", name=" + name + ", duration=" + duration + ", season="
				+ seasons + "]";
	}
	
	
	

}
