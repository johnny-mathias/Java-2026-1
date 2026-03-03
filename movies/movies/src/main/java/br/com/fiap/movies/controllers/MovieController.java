package br.com.fiap.movies.controllers;

import br.com.fiap.movies.models.Movie;
import br.com.fiap.movies.services.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private final Logger log = LoggerFactory.getLogger((getClass()));

    @Autowired
    private MovieService service;

    @GetMapping("/")
    public String healthCheck() {
        return "Server UP";
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        log.info("Listando todos os filmes");
        return service.getMovies();
    }

    @PostMapping("/movies")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addMovie(@RequestBody Movie movie){ //Binding
        log.info("Cadastrando filme...");
        service.addMovie(movie);
    }
}
