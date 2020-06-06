package com.practice;

import java.util.*;

public class MovieRatingCollector {
    public static class RatingCollectorImpl implements RatingCollector {
        private Map<String, List<Double>> movieRatings = new HashMap<>();
        @Override
        public void putNewRating(String movie, double rating) {
            synchronized (movieRatings) {
                if (!movieRatings.containsKey(movie)) {
                    movieRatings.put(movie, new ArrayList<>());
                }
                List<Double> ratings = movieRatings.get(movie);
                ratings.add(rating);
                movieRatings.put(movie, ratings);
            }
        }

        @Override
        public double getAverageRating(String movie) {
            double average = 0;
            if(movieRatings.containsKey(movie)){
                average = movieRatings.get(movie).stream()
                        .mapToDouble(value -> value)
                        .average().getAsDouble();
            }
            return average;
        }

        @Override
        public int getRatingCount(String movie) {
            Long ratingCount = 0L;
            if(movieRatings.containsKey(movie)){
                ratingCount = movieRatings.get(movie).stream().count();
            }
            return ratingCount.intValue();
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingCollector {
        // This is an input. Make note of this rating.  Rating can be a double number between 0 and 100.
        void putNewRating(String movie, double rating);

        // Get the average rating
        double getAverageRating(String movie);

        // Get the total number of ratings received for the movie
        int getRatingCount(String movie);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingCollector stats = new RatingCollectorImpl();
            final Set<String> movies = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                movies.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewRating(symbol, price);

            }

            for (String movie : movies) {
                System.out.println(
                        String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
            }

        }
        scanner.close();

    }
}
