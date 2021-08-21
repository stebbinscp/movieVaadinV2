package com.example.application.service;

import com.example.application.models.Result;
import org.springframework.stereotype.Service;
import com.example.application.repository.MovieRepository;

import java.util.List;


@Service
public class MovieService {

    private MovieRepository movieRepository;


    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public void getMovies(ResponseCallback<List<Result>> callback, int offset, int limit, String search) {

        System.out.println("fetching movies!");

        movieRepository.getMovies(callback, offset, limit, search);


    }


}
