package com.javaunit3.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MovieApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MovieApp.class);

        //getting the best movie service using application context
        BestMovieService bestMovieService = applicationContext.getBean("bestMovieService", BestMovieService.class);

        //getting the best movie from movie service
        Movie bestMovie = bestMovieService.getBestMovie();

        System.out.println("Title: " + bestMovie.getTitle() + "\nMaturity Rating: " + bestMovie.getMaturityRating() + "\nGenre: " + bestMovie.getGenre());



    }
}
