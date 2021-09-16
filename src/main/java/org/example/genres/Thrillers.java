package org.example.genres;

import org.example.Film;

public class Thrillers implements Film {
    private String name;

    public Thrillers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFilm() {
        return name;
    }
}
