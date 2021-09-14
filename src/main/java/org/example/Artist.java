package org.example;

import java.util.List;

public class Artist {

    private List<String> listArtWorks;
    private String name;
    private int id;

    public Artist(int id, String name, List<String> listArtWorks) {
        this.listArtWorks = listArtWorks;
        this.name = name;
        this.id = id;
    }

    public Artist() {
    }


    public List<String> getListArtWorks() {
        return listArtWorks;
    }

    public void setListArtWorks(List<String> listArtWorks) {
        this.listArtWorks = listArtWorks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
