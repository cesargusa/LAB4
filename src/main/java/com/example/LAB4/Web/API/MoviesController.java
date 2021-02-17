package com.example.LAB4.Web.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.LAB4.Repositories.Entities.MovieEntity;
import com.example.LAB4.Services.MoviesServices;
import com.example.LAB4.Services.Models.MovieDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movies")
public class MoviesController {
    private final MoviesServices moviesServices;

    MoviesController(MoviesServices moviesServices){
        this.moviesServices=moviesServices;
    }

    @GetMapping()
    public List<MovieDTO> GetMovies(@RequestParam(name = "title",required = false, defaultValue = "") String title,
    @RequestParam(name = "year", required = false, defaultValue = "") String year) {
            if (!title.equals("") && year.equals("")){
                return moviesServices.findByTitle(title);
            }
            if(!year.equals("") && title.equals("")){
                return moviesServices.findByYear(year);
            }
            
             if(!title.equals("") && !year.equals("")){
                    return moviesServices.findByTitleAndYear(title, year);
            } 
            if(title.equals("") && year.equals("")){
                 return moviesServices.GetAll();
            }
            return null;
            
               

            
        }

    }

    // GET METHOD
    /* @GetMapping("/V2/movies")
    public static ArrayList<MovieEntity> GetAllMovies(
            @RequestParam(name = "title", defaultValue = "", required = false) String title,
            @RequestParam(name = "year", defaultValue = "", required = false) String year,
            @RequestParam(name = "id", defaultValue = "0", required = false) Long id) {
        ArrayList<MovieEntity> AllMovies = new ArrayList<MovieEntity>();
        if (id!=0) {
            for (MovieEntity elem : moviesV2) {
                if (elem.getId().equals(id)) {
                    AllMovies.add(elem);
                }
            }
            return AllMovies;
        }
        if (title.equals("") && year.equals(""))
            return moviesV2;
        if (!title.equals("") && year.equals("")) {
            for (MovieEntity element : moviesV2) {
                if (element.getTitle().contains(title)) {
                    AllMovies.add(element);
                }
            }
            return AllMovies;
        }
        if (title.equals("") && !year.equals("")) {
            for (MovieEntity element : moviesV2) {
                if (element.getYear().contains(year)) {
                    AllMovies.add(element);
                }
            }
            return AllMovies;
        }
        if (!title.equals("") && !year.equals("")) {
            for (MovieEntity element : moviesV2) {
                if (element.getTitle().contains(title) && element.getYear().contains(year)) {
                    AllMovies.add(element);
                }
            }
            return AllMovies;
        }

        return null;

    }
 */


