import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a
number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */

class NearHundredTest {

    NearHundred nh = new NearHundred();

    @Test
    void nearHundred() {
        assertTrue(nh.nearHundred(93));
        assertTrue(nh.nearHundred(90));
        assertFalse(nh.nearHundred(89));
        assertTrue(nh.nearHundred(110));
        assertFalse(nh.nearHundred(111));
        assertFalse(nh.nearHundred(121));
        assertFalse(nh.nearHundred(-101));
        assertFalse(nh.nearHundred(-209));
        assertTrue(nh.nearHundred(190));
        assertTrue(nh.nearHundred(209));
        assertFalse(nh.nearHundred(0));
        assertFalse(nh.nearHundred(5));
        assertFalse(nh.nearHundred(-50));
        assertTrue(nh.nearHundred(191));
        assertFalse(nh.nearHundred(189));
        assertTrue(nh.nearHundred(200));
        assertTrue(nh.nearHundred(210));
        assertFalse(nh.nearHundred(211));
        assertFalse(nh.nearHundred(290));
    }
}