package com.example.application.repository;

import com.example.application.models.MovieResponse;
import com.example.application.models.Result;
import com.example.application.service.ResponseCallback;
import org.springframework.stereotype.Repository;

import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class MovieRepository {

    private final String BASE = "https://imdb8.p.rapidapi.com/title/find?q=%s";

    public void getMovies(ResponseCallback<List<Result>> callback, String search) {

        String formatted = String.format(BASE, search);
        WebClient.RequestHeadersSpec<?> spec = WebClient.create().get()
                .uri(formatted)
                .header("x-rapidapi-key", "a9abe16e01msh26d9439e9eb0634p10387fjsnab19efc4fc67")
                .header("x-rapidapi-host", "imdb8.p.rapidapi.com");

        spec.retrieve().toEntity(MovieResponse.class).subscribe(movieResponse -> {

//            final MovieRepository movieResponse = movieResponse.getBody().get;
//            if (null == movieResponse || null == movieResponse.get()) return;
            callback.operationFinished(movieResponse.getBody().getResults());

        });

    }

}
