package com.example.LAB4.Web.API;


import java.util.List;

import com.example.LAB4.Services.MoviesServices;
import com.example.LAB4.Services.Models.MovieDTO;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
  
        @GetMapping("/{id}")
        public List<MovieDTO> GetId(@PathVariable("id") Long id){
            return moviesServices.GetId(id);
        }

        @PostMapping
    public MovieDTO AddMovie(@RequestBody MovieDTO movie){
        return moviesServices.add(movie);
    }
    
    @PutMapping("/{id}")
    public MovieDTO UpdateMovie(@RequestBody MovieDTO movie, @PathVariable("id") Long id){
        return moviesServices.update(id,movie);
    }
    
    @DeleteMapping("/{id}")
    public void DeleteMovie(@PathVariable("id") Long id){
        moviesServices.delete(id);

    }
    }

  

