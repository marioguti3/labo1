package com.example.laboratorio1.API;

import java.util.Arrays;

import src.main.resources.Model.Movie;

@RestController 
public class MoviesController{
    private static ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(
        new Movie(1,"Nueva generacion",2008),
        new Movie(2,"Avatar",2010),
        new Movie(3,"Ocho apellidos vascos ",2017),
        new Movie(4," War dogs ",2019)
    ));

    @GetMapping("/movies")
    public ArrayList<Movie> GettAll(@RequestParam(
        name = "postId",
        required = false,
        defaultValue = "0") int id){
            ArrayList<Post> result = getMoviebyUserId(id);
            return result;
        }

        public static ArrayList<Movie> getMoviebyUserId( int id){
            ArrayList<Movie> result = movies;
            if(id != 0){
                result = new ArrayList<Movie>();
                for(Movie movie : movies){
                    if(movies.getMoviebyUserId()== id)
                    result.add(movie);
                }
            }

            return result;
        }

}