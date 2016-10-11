package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for new release movies {@link NewReleaseMovie}.
 */

public class NewReleaseMovieTest {

    private static final double DELTA = 0.001;


    private Movie releaseMovie;

    /**
     * Before method to set up the new release movie name.
     */
    @Before
    public void setUp() {
        final String movieName = "Assassin's Creed";
        releaseMovie = new NewReleaseMovie(movieName);
    }

    /**
     * Test to calculate the amount if days are 4.
     */
    @Test
    public void testCalculateAmountIfDaysAre4() {
        final double expected = 12;
        final int daysRented = 4;
        assertEquals(expected, releaseMovie.calculateAmount(daysRented), DELTA);
    }

    /**
     * Test to calculate frequent renter points if days are 4.
     */
    @Test
    public void testCalculateFrequentRenterPointsIfPointsAre4() {
        final double expected = 2;
        final int daysRented = 4;
        assertEquals(expected, releaseMovie.calculateFrequentRenterPoints(daysRented), DELTA);
    }
}
