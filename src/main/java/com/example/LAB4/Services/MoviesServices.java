package com.example.LAB4.Services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.LAB4.Repositories.Interfaces.MoviesRepository;
import com.example.LAB4.Services.Models.MovieDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class MoviesServices {
    @Autowired
    private MoviesRepository moviesRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<MovieDTO> GetAll(){
        return moviesRepository.findAll().stream()
        .map(x -> modelMapper.map(x, MovieDTO.class))
        .collect(Collectors.toList());
    }
}
