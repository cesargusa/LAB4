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
    @Column(name = "UrlId")
    private String urlId;
    @Column(name = "Description")
    private String description;

    public MovieEntity() {
    }

    public MovieEntity(String title, String year, String poster, String description) {
        this.id = id;
        this.title=title;
        this.year=year;
     
        this.poster = poster;
        this.description = description;
        urlId();
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getUrlId() {
        return urlId;
    }

    public void setUrlId(String urlId) {
        this.urlId = urlId;
    }

    public void urlId() {
        this.urlId = "http://localhost:9092/V2/movies/Buscador/detail?id=" + getId();
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
