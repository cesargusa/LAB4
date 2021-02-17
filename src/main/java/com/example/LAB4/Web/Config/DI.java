package com.example.LAB4.Web.Config;

import com.example.LAB4.Services.MoviesServices;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DI {
    @Bean
    ModelMapper createModelMapper() {
        return new ModelMapper();
    }

    @Bean
    MoviesServices createMovieService(){
        return new MoviesServices();
    }
/*     @Bean
    UsersService createUserService() {
        return new UsersService();
    }

    @Bean
    PostsService createPostService() {
        return new PostsService();
    }

    @Bean
    PostsAsyncService createPostAsyncService(){
        return new PostsAsyncService();
    } */
}
