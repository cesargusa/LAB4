package com.example.LAB4.Repositories.Interfaces;

import java.util.Collection;

import com.example.LAB4.Repositories.Entities.MovieEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MoviesRepository extends JpaRepository<MovieEntity, Long> {
    // Sentencia SQL que muestra los posts del userId que introduzcamos
    @Query(value = "SELECT m " + " FROM Movies m " + " WHERE Id = :Id")
    Collection<MovieEntity> findByMovieId(@Param("Id") Long Id);

    @Query(value = "SELECT m " + " FROM Movies m " + " WHERE title = :title")
    Collection<MovieEntity> findByTitle(@Param("title") String title);

    @Query(value = "SELECT m " + " FROM Movies m " + " WHERE year = :year")
    Collection<MovieEntity> findByYear(@Param("year") String year);

    @Query(value = " SELECT m " + " FROM Movies m " + " WHERE title = :title " + " AND year = :year")
    Collection<MovieEntity> findByTitleAndYear(@Param("title") String title, @Param("year") String year);
 
}
