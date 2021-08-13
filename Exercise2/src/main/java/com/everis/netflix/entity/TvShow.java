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
@Table(name = "tvshow")
public class TvShow implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String short_description;

	private String long_description;

	private String year;
	
	private Integer recomended_age;
	
	private String advertising;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@OneToMany(mappedBy="tvshows")
	private List<Season> seasons = new ArrayList<>();

	
	
	public TvShow() {
		super();
	}


	public TvShow(String name, String short_description, String long_description, String year, Integer recomended_age,
			String advertising) {


		this.name = name;
		this.short_description = short_description;
		this.long_description = long_description;
		this.year = year;
		this.recomended_age = recomended_age;
		this.advertising = advertising;
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public List<Season> getSeasons() {
		return seasons;
	}


	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}

	public String getLong_description() {
		return long_description;
	}

	public void setLong_description(String long_description) {
		this.long_description = long_description;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getRecomended_age() {
		return recomended_age;
	}

	public void setRecomended_age(Integer recomended_age) {
		this.recomended_age = recomended_age;
	}

	public String getAdvertising() {
		return advertising;
	}

	public void setAdvertising(String advertising) {
		this.advertising = advertising;
	}


	@Override
	public String toString() {
		return "TvShow [id=" + id + ", name=" + name + ", short_description=" + short_description
				+ ", long_description=" + long_description + ", year=" + year + ", recomended_age=" + recomended_age
				+ ", advertising=" + advertising + ", category=" + category + ", seasons=" + seasons + "]";
	}


	
	
	
	
}
