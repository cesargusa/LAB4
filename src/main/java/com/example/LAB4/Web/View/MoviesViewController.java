package com.example.LAB4.Web.View;

import java.util.ArrayList;


import com.example.LAB4.Repositories.Entities.MovieEntity;
import com.example.LAB4.Web.API.MoviesController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoviesViewController {
   /*  @GetMapping("/movies/Buscador")
    public ModelAndView GetAll(@RequestParam( name="title", required=false,defaultValue="") String title,
    @RequestParam(name="year",required = false,defaultValue = "") String year,
    @RequestParam(name="id",required = false,defaultValue = "0") Long id){
        ArrayList<MovieEntity> result = MoviesController.GetAllMovies(title, year,id);
        
        ModelAndView mv = new ModelAndView("buscadorV2");
        mv.addObject("buscadorV2", result);
        return mv;
    }

    @GetMapping("/movies/Buscador/detail")
    public ModelAndView GetAlls(@RequestParam( name="title", required=false,defaultValue="") String title,
    @RequestParam(name="year",required = false,defaultValue = "") String year,
    @RequestParam(name="id",required = false,defaultValue = "0") Long id){
        ArrayList<MovieEntity> result = MoviesController.GetAllMovies(title, year,id);
        
        ModelAndView mv = new ModelAndView("movieDetail");
        mv.addObject("movieDetail", result);
        return mv;
    } */

}
