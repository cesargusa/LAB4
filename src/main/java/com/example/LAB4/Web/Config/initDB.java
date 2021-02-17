package com.example.LAB4.Web.Config;

import com.example.LAB4.Repositories.Entities.MovieEntity;
import com.example.LAB4.Repositories.Interfaces.MoviesRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class initDB {
    @Bean
    CommandLineRunner initDatabase(MoviesRepository repository){
        return args ->{

           
            repository.save(new MovieEntity("Peaky Blinders",
            "2020", 
            "https://m.media-amazon.com/images/M/MV5BMTkzNjEzMDEzMF5BMl5BanBnXkFtZTgwMDI0MjE4MjE@._V1_SX300.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsu."));
            repository.save(new MovieEntity("Vikings", "2013", 
            "https://m.media-amazon.com/images/M/MV5BNjIzZjljZmQtOGNiYi00YmY2LWE1MGYtN2VlMmEyZDBlMzRmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ip"));
            repository.save(new MovieEntity("Joker", "2019", 
            "https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has bee"));
            repository.save(new MovieEntity("It", "2019", 
            "https://m.media-amazon.com/images/M/MV5BZDVkZmI0YzAtNzdjYi00ZjhhLWE1ODEtMWMzMWMzNDA0NmQ4XkEyXkFqcGdeQXVyNzYzODM3Mzg@._V1_SX300.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry"));
            repository.save(new MovieEntity( "Gladiator", "2000",
            "https://m.media-amazon.com/images/M/MV5BMDliMmNhNDEtODUyOS00MjNlLTgxODEtN2U3NzIxMGVkZTA1L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard d"));
            repository.save(new MovieEntity("Vikingdom", "2013", 
            "https://m.media-amazon.com/images/M/MV5BMTc3ODIzMDMwMl5BMl5BanBnXkFtZTgwMDY1NDg5MjE@._V1_SX300.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy "));
            repository.save(new MovieEntity( "Bad Boys for Life", "2020",
            "https://m.media-amazon.com/images/M/MV5BMWU0MGYwZWQtMzcwYS00NWVhLTlkZTAtYWVjOTYwZTBhZTBiXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text "));
           
        
    };
    }
}
