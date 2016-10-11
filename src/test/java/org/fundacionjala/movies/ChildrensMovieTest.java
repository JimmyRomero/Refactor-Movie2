package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for children movies {@link ChildrensMovie}.
 */
public class ChildrensMovieTest {

    private Movie childrenMovie;
    private static final double DELTA = 0.001;

    /**
     * Set up the children movie name.
     */
    @Before
    public void setUp() {
        final String movieName = "Gorilla's Island.";
        childrenMovie = new ChildrensMovie(movieName);
    }

    /**
     * Test to calculate the amount if days are 4.
     */
    @Test
    public void testCalculateAmountIfDaysAre4() {
        final double expectedAmount = 3;
        final int renterDays = 4;
        assertEquals(expectedAmount, childrenMovie.calculateAmount(renterDays), DELTA);
    }

    /**
     * Test to calculate frequent renter points, if points are 1.
     */
    @Test
    public void testCalculateFrequentRenterPointsIfPointsAre1() {
        final double expected = 1;
        final int renterDays = 2;
        assertEquals(expected, childrenMovie.calculateFrequentRenterPoints(renterDays), DELTA);
    }
}
