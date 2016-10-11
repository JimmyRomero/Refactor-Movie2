package org.fundacionjala.movies;

/**
 * Class that manage movie.
 */
public abstract class Movie {

    private static final int POINT = 1;
    private final String title;
    private final double amount;
    private final double increment;
    private final int limitDays;

    /**
     * Constructor method for Movie.
     *
     * @param titleMovie     The title of the movie.
     * @param amountMovie    The amount.
     * @param incrementMovie The increment.
     * @param limitDaysMovie The limit days.
     */
    public Movie(final String titleMovie, final double amountMovie,
                 final double incrementMovie, final int limitDaysMovie) {
        this.title = titleMovie;
        this.amount = amountMovie;
        this.increment = incrementMovie;
        this.limitDays = limitDaysMovie;
    }

    /**
     * Get the title of the movie.
     *
     * @return The title of the movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to calculate the amount.
     *
     * @param daysRented The daysrented.
     * @return The total amount to pay a movie.
     */
    public double calculateAmount(final int daysRented) {
        return daysRented > limitDays ? amount + ((daysRented - limitDays) * increment)
                : amount;
    }

    /**
     * Calculates the frequent renter points.
     *
     * @param daysRented The days rented.
     * @return The calculation of the amount.
     */
    public int calculateFrequentRenterPoints(final int daysRented) {
        return POINT;
    }
}
