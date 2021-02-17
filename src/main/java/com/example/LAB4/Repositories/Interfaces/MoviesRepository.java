package com.example.LAB4.Repositories.Interfaces;

import com.example.LAB4.Repositories.Entities.MovieEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<MovieEntity,Long>{
    
}
