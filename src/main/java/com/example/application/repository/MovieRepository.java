package com.example.application.repository;

import org.springframework.stereotype.Repository;

import org.springframework.web.reactive.function.client.WebClient;
import com.example.application.models.Example;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {

    private final String BASE = "https://imdb8.p.rapidapi.com/title/find?q=%s";

    public void getMovies(ResponseCallback<Example> callback, String search) {


        String formatted = String.format(BASE, search);
        WebClient.RequestHeadersSpec<?> spec = WebClient.create().get()
                .uri(formatted)
                .header("x-rapidapi-key", "a9abe16e01msh26d9439e9eb0634p10387fjsnab19efc4fc67")
                .header("x-rapidapi-host", "imdb8.p.rapidapi.com");

        spec.retrieve().toEntity(Example.class).subscribe(result -> {

            final Example movieResponse = result.getBody();
            if (null == movieResponse || null == movieResponse.getD()) return;
            callback.operationFinished(movieResponse);

        });

    }

}
