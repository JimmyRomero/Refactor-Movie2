package org.fundacionjala.movies;

/**
 * Calculates the amount and frequent renter points for children movies.
 */
public class ChildrensMovie extends Movie {

    private static final double THIS_AMOUNT = 1.5;
    private static final double INCREMENT = 1.5;
    private static final int DAYS_LIMIT = 3;

    /**
     * Method for children movie.
     *
     * @param title The title of the movie.
     */
    public ChildrensMovie(final String title) {
        super(title, THIS_AMOUNT, INCREMENT, DAYS_LIMIT);
    }
}
