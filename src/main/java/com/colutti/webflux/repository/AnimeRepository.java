package com.colutti.webflux.repository;

import com.colutti.webflux.model.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {
}
