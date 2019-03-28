import static org.junit.jupiter.api.Assertions.assertEquals;

import classwork.RecursiveMultiplication;
import org.junit.jupiter.api.Test;

class RecursiveMultiplicationTests {

    @Test
    void fiveTimesFive() {
        int actual = RecursiveMultiplication.multiply(5, 5);
        assertEquals(25, actual);
    }

    @Test
    void tenTimesThree() {
        int actual = RecursiveMultiplication.multiply(10, 3);
        assertEquals(30, actual);
    }

    @Test
    void zeroTimesThirtyOne() {
        int actual = RecursiveMultiplication.multiply(0, 31);
        assertEquals(0, actual);
    }

    @Test
    void twentyTimesZero() {
        int actual = RecursiveMultiplication.multiply(20, 0);
        assertEquals(0, actual);
    }

    @Test
    void sixTimesSeven() {
        int actual = RecursiveMultiplication.multiply(6, 7);
        assertEquals(42, actual);
    }

    @Test
    void sevenTimesSix() {
        int actual = RecursiveMultiplication.multiply(7, 6);
        assertEquals(42, actual);
    }

    @Test
    void oneTimesOneHundred() {
        int actual = RecursiveMultiplication.multiply(1, 100);
        assertEquals(100, actual);
    }
}
