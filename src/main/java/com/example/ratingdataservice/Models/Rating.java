package com.example.ratingdataservice.Models;

public class Rating {
    public String movieId;
    public int rating;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Rating(String movieId, int rating) {

        this.movieId = movieId;
        this.rating = rating;
    }
}
