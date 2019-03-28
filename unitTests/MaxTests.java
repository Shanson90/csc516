import static org.junit.jupiter.api.Assertions.assertEquals;

import homework.Max;
import org.junit.jupiter.api.Test;

public class MaxTests {

    @Test
    void exampleOne() {
        int[] ary = new int[]{0, 1, 2, 3, 4};
        int actual = Max.find(ary);
        assertEquals(4, actual);
    }

    @Test
    void exampleTwo() {
        int[] ary = new int[]{4, 3, 2, 5, 8, 9, 7, 1};
        int actual = Max.find(ary);
        assertEquals(9, actual);
    }

}
