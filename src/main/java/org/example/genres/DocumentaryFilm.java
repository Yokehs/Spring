package org.example.genres;

import org.example.Film;

public class DocumentaryFilm implements Film {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocumentaryFilm(String name) {
        this.name = name;
    }

    @Override
    public String getFilm() {
        return name;
    }
}
