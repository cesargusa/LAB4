package com.example.LAB4.Web.View;

import java.util.List;
import java.util.Optional;

import com.example.LAB4.Services.MoviesServices;
import com.example.LAB4.Services.Models.MovieDTO;
import com.example.LAB4.Web.API.MoviesController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoviesViewController {
    private final MoviesController moviesController;
    private final MoviesServices moviesServices;

    MoviesViewController(MoviesController moviesController, MoviesServices moviesServices){
        this.moviesController=moviesController;
        this.moviesServices=moviesServices;
   
    }
        

  
        @GetMapping("/movies/Buscador")
        public ModelAndView GetAll(@RequestParam( name="title", required=false,defaultValue="") String title,
        @RequestParam(name="year",required = false,defaultValue = "") String year){
            List<MovieDTO> result = moviesController.GetMovies(title, year);
            
            ModelAndView mv = new ModelAndView("buscadorV2");
            mv.addObject("buscadorV2", result);
            return mv;
        }

     
        public Optional<MovieDTO> GetId(@PathVariable("id") Long id){
            return moviesServices.findById(id);
        } 
       @GetMapping("/movies/Buscador/detail/{id}")
        public ModelAndView GetById(
        @PathVariable("id") Long id){
            
            List<MovieDTO> result2 = moviesController.GetId(id);
            ModelAndView mv = new ModelAndView("movieDetail");
            
            mv.addObject("movieDetailId", result2);
            return mv;
        }    
    }
    

   


