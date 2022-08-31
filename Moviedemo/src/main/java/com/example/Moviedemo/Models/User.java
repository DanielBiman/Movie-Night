package com.example.Moviedemo.Models;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String movieName;
    @Column
    private String director;
    @Column
    private long rating;

    public long getid(){
        return id;
    }
    public void setid(long id){
        this.id = id;
    }

    public String getmovieName(){
        return movieName;
    }
    public void setmovieName(String movieName){
        this.movieName = movieName;
    }
    public String getdirector(){
        return director;
    }
    public void setdirector(String director){
        this.director = director;
    }
    public long getrating(){
        return rating;
    }
    public void setrating(long rating){
        this.rating = rating;
    }

}