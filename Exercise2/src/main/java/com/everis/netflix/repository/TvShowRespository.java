package com.everis.netflix.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.everis.netflix.entity.TvShow;

@Repository
public interface TvShowRespository extends JpaRepository<TvShow,Long>{



}
