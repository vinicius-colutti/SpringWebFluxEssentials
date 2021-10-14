package com.colutti.webflux.controller;

import com.colutti.webflux.model.Anime;
import com.colutti.webflux.repository.AnimeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("animes")
public class AnimeController {

    private final AnimeRepository animeRepository;

    public AnimeController(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    @GetMapping
    public Flux<Anime> listAll(){
        return animeRepository.findAll();
    }
}
