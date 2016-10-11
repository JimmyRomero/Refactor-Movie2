package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for rental {@link Rental}.
 */
public class RentalTest {

    private static final double DELTA = 0.0;
    private Rental rental;
    private Movie movie;

    /**
     * Method to set up the movie name, and the days of rental.
     */
    @Before
    public void setUp() {
        final String movieName = "The last to know.";
        movie = new RegularMovie(movieName);
        final int rentalDays = 5;
        rental = new Rental(movie, rentalDays);
    }

    /**
     * Test to verify the days rented are the same.
     */
    @Test
    public void testTheDaysRentedAreTheSame() {
        final int expectedRentalDays = 5;
        assertEquals(expectedRentalDays, rental.getDaysRented());
    }

    /**
     * Test to verify that the movie rented are the same.
     */
    @Test
    public void testTheMovieRentedAreTheSame() {
        final Movie expectedMovie = movie;
        assertEquals(expectedMovie, rental.getMovie());
    }

    /**
     * Test to calculate the total amount according the days and the movie.
     */
    @Test
    public void testCalculatesTheTotalAmountAccordingTheDaysAndTheMovie() {
        final double expectedResult = 6.5;
        assertEquals(expectedResult, rental.calculateAmount(), DELTA);
    }

    /**
     * Test to calculate the frequent rental points according the days and de movie.
     */
    @Test
    public void testCalculateTheFrequentRentalPointsAccordingTheDaysAndMovie() {
        final int expectedResult = 1;
        assertEquals(expectedResult, rental.calculateFrequentRenterPoints());
    }
}
