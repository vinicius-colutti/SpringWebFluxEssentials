package com.colutti.webflux.controller;

import com.colutti.webflux.model.Anime;
import com.colutti.webflux.repository.AnimeRepository;
import com.colutti.webflux.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("animes")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping
    public Flux<Anime> listAll(){
        return animeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Anime> listAll(@PathVariable int id){
        return animeService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Anime> save(@Valid @RequestBody Anime anime){
        return animeService.save(anime);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> update(@Valid @RequestBody Anime anime, @PathVariable int id){
        anime.setId(id);
        return animeService.update(anime);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> delete(@PathVariable int id){
        return animeService.delete(id);
    }
}
