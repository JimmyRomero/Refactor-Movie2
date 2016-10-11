package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for regular movies {@link RegularMovie}.
 */

public class RegularMovieTest {

    private Movie regularMovie;

    private static final double DELTA = 0.001;

    /**
     * Before method to set up the regular movie name.
     */
    @Before
    public void setUp() {
        final String movieName = "Never Back Down";
        regularMovie = new RegularMovie(movieName);
    }

    /**
     * Test to calculate the amount if days are 4.
     */
    @Test
    public void testCalculateAmountIfDaysAre4() {
        final double expected = 5;
        final int renterDays = 4;
        assertEquals(expected, regularMovie.calculateAmount(renterDays), DELTA);
    }

    /**
     * Test to calculate frequent renter points if points are 4.
     */
    @Test
    public void testCalculateFrequentRenterPointsIfPointsAre4() {
        final double expected = 1;
        final int renterDays = 4;
        assertEquals(expected, regularMovie.calculateFrequentRenterPoints(renterDays), DELTA);
    }
}
