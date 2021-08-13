package com.everis.netflix.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.everis.netflix.entity.Chapter;

@Repository
public interface ChapterRespository extends JpaRepository<Chapter,Long>{



}
