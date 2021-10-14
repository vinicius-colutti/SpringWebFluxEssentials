package com.colutti.webflux.model;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Anime {

    @Id
    private Integer id;

    @NotEmpty(message = "The name of this anime cannot empty")
    @NotNull
    private String name;

    public Anime(){

    }

    public Anime(Integer id, @NotEmpty @NotNull String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
