package org.fundacionjala.movies;

/**
 * Calculates the amount and frequent renter points for regular movies.
 */
public class RegularMovie extends Movie {

    private static final double THIS_AMOUNT = 2;
    private static final double INCREMENT = 1.5;
    private static final int DAYS_LIMIT = 2;

    /**
     * Constructor method for regular movie.
     *
     * @param title The title of the movie.
     */
    public RegularMovie(final String title) {
        super(title, THIS_AMOUNT, INCREMENT, DAYS_LIMIT);
    }
}
