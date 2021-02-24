package com.example.LAB4.Repositories.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Movies")
@Entity(name = "Movies")
public class MovieEntity {
    @Column(name = "Title")
    private String title;
    @Column(name = "Year")
    private String year;
    @Column(name = "Id")
    private @Id @GeneratedValue Long id;
 
    @Column(name = "Poster")
    private String poster;
    @Column(name = "Description")
    private String description;

    public MovieEntity() {
    }

    public MovieEntity(String title, String year, String poster, String description) {
        this.title=title;
        this.year=year;
        this.poster = poster;
        this.description = description;
    
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
