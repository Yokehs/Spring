package org.example;


import java.util.ArrayList;
import java.util.List;

public class Cinema{
    private List<Film> filmList;
    private String name;
    private long filmLength;


    public Cinema() {}

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(long filmLength) {
        this.filmLength = filmLength;
    }

    public void showFilms(){
        int i = 0;
        if (i < filmList.size()){
            while (i < filmList.size()) {
                System.out.println(filmList.get(i).getFilm());
                i++;
            }
            System.out.println("Показ окончен");
        } else {
            System.out.println("Фильмов нет");
        }
    }
    /*public void showFilm(){
        System.out.println("Film show: " + film.getFilm());
    }

    public void getProperty(){
        System.out.println("Film: " + film.getFilm());
        System.out.println("Name: " + name);
        System.out.println("Length: " + timeToString(filmLength));
    }


    public String timeToString(long secs){
        long hour = secs / 3600,
                min = secs / 60 % 60,
                sec = secs % 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }*/

}
