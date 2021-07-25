package com.example.application.service;

import org.springframework.stereotype.Service;
import com.example.application.models.Example;
import com.example.application.repository.MovieRepository;


@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public void getMovies(ResponseCallback<Example> callback, String search) {

        System.out.println("fetching movies!");

        movieRepository.getMovies(callback, search);


    }


}
