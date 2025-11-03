package HomeWork_13_complex.complex_task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieService <T extends Number> {

    Map<Movie, List<Rating<T>>> ratings = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        if (rating.getRating().doubleValue() >= 1 && rating.getRating().doubleValue() <= 10) {
            ratings.computeIfAbsent(movie, key -> new ArrayList<>()).add(rating);
        } else {
            throw new IllegalArgumentException("Значение рейтинга должно быть в пределах от 1 до 10");
        }
    }

    public synchronized double getAverageRating(Movie movie) {
        List<Rating<T>> moveRatings = ratings.get(movie);

        if (moveRatings == null || moveRatings.isEmpty()){
            throw new IllegalArgumentException("Рейтинг не может быть пустой");
        }

        return moveRatings.stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElse(0.0);
    }

    public Map<Movie, List<Rating<T>>> getRatings(){
        return ratings;
    }


    // код ниже взял из разбора дз (разобрался как он работает)
    // так как самому (с помощью гугла и gpt) было очень сложно в этом разобраться
    private double average(List<Rating<T>> ratings) {
        return ratings.stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<Movie> getSortedMoviesByRating() {
        return ratings.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(
                        average(e2.getValue()),
                        average(e1.getValue())
                ))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
