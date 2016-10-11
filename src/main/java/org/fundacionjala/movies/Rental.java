package org.fundacionjala.movies;

/**
 * Class for rental.
 */
class Rental {

    private final Movie movie;
    private final int daysRented;

    /**
     * Constructor method for Rental movie.
     *
     * @param movieRental The movie.
     * @param daysRentedRental  The days rented.
     */
    public Rental(final Movie movieRental, final int daysRentedRental) {
        this.movie = movieRental;
        this.daysRented = daysRentedRental;
    }

    /**
     * Get the movie.
     *
     * @return The movie.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Calculate the amount.
     *
     * @return The calculation of the amount.
     */
    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    /**
     * Get the days of the rent.
     *
     * @return The days of the rent.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Calculate the renter points.
     *
     * @return The calculation of the renter points.
     */
    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }
}
