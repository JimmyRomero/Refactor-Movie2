package org.fundacionjala.movies;

/**
 * Calculates the amount and frequent renter points for new release movies.
 */
class NewReleaseMovie extends Movie {
    private static final double THIS_AMOUNT = 3;
    private static final double INCREMENT = 0;
    private static final int DAYS_LIMIT = 1;

    /**
     * Constructor method for New release movie.
     *
     * @param title The title of the movie.
     */
    public NewReleaseMovie(final String title) {
        super(title, THIS_AMOUNT, INCREMENT, DAYS_LIMIT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(final int daysRented) {
        final double baseAmount = 3;
        return daysRented * baseAmount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
