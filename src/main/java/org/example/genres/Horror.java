package org.example.genres;

import org.example.Film;

public class Horror implements Film {
    private String name = "Some Horror";

    public Horror() {
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
