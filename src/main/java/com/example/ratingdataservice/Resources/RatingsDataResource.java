package com.example.ratingdataservice.Resources;

import com.example.ratingdataservice.Models.Rating;
import com.example.ratingdataservice.Models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("rating")
public class RatingsDataResource {
    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable String userId){
        List<Rating> ratings= Arrays.asList(new Rating("100",4),new Rating("200",3));
        return new UserRating(ratings);
    }

}
