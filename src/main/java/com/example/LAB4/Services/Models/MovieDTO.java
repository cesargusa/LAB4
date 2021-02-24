package com.example.LAB4.Services.Models;

public class MovieDTO {
    private Long id;
    private String title;
    private String year;
    private String poster;
    private String description;

    public MovieDTO() {
    }

    public MovieDTO( Long id,String title, String year, String poster, String description) {
        this.id = id;
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
