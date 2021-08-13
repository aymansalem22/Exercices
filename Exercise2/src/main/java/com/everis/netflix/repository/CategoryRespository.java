package com.everis.netflix.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.everis.netflix.entity.Category;

@Repository
public interface CategoryRespository extends JpaRepository<Category,Long>{



}
