package HomeWork_13_complex.complex_task4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {

    @Test
    public void addRatingTest(){
        MovieService<Integer> movieService = new MovieService<>();

        Movie movie = new Movie("Бэтмен");

        movieService.addRating(movie,new Rating<>(10));
        assertTrue(movieService.getRatings().containsKey(movie));

        List<Rating<Integer>> movieRating = movieService.getRatings().get(movie);
        assertEquals(10, movieRating.get(0).getRating());
    }

    @Test
    public void addIvalidRatingTest(){
        MovieService<Integer> movieService = new MovieService<>();

        Movie movie = new Movie("Бэтмен");

        assertThrows(IllegalArgumentException.class, () -> movieService.addRating(movie, new Rating<>(11)));
    }

    @Test
    public void averageRatingTest(){
        MovieService<Integer> movieService = new MovieService<>();

        Movie movie = new Movie("Бэтмен");

        movieService.addRating(movie,new Rating<>(10));
        movieService.addRating(movie,new Rating<>(6));

        assertEquals(8, movieService.getAverageRating(movie));
    }

    @Test
    public void averageRatingWithoutRatingTest(){
        MovieService<Integer> movieService = new MovieService<>();

        Movie movie = new Movie("Бэтмен");

        assertThrows(IllegalArgumentException.class, () -> movieService.getAverageRating(movie));
    }

    @Test
    void testSortedMoviesByRating() {
        MovieService<Double> service = new MovieService<>();

        Movie m1 = new Movie("Movie A");
        Movie m2 = new Movie("Movie B");

        service.addRating(m1, new Rating<>(6.0));
        service.addRating(m2, new Rating<>(9.0));

        List<Movie> sorted = service.getSortedMoviesByRating();

        assertEquals(m2, sorted.get(0));
        assertEquals(m1, sorted.get(1));
    }

}
