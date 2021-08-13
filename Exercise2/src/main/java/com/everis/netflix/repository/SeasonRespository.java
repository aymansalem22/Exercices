package com.everis.netflix.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.everis.netflix.entity.Season;

@Repository
public interface SeasonRespository extends JpaRepository<Season,Long>{



}
