package org.example;


public class Cinema{
    private Film film;
    private String name;
    private long filmLength;

    public Cinema(Film film) {
        this.film = film;
    }

    public Cinema() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public long getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(long filmLength) {
        this.filmLength = filmLength;
    }

    public void showFilm(){
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
    }

}
