import homework.HighScores;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighScoresTests {

    @Test
    void constructor() {
        HighScores scores = new HighScores();
        String[] printOut = scores.getScores();
        assertEquals(": 0", printOut[0]);
        assertEquals(": 0", printOut[1]);
        assertEquals(": 0", printOut[2]);
        assertEquals(": 0", printOut[3]);
        assertEquals(": 0", printOut[4]);
        assertEquals(": 0", printOut[5]);
        assertEquals(": 0", printOut[6]);
        assertEquals(": 0", printOut[7]);
        assertEquals(": 0", printOut[8]);
        assertEquals(": 0", printOut[9]);
    }

    @Test
    void insertSingle() {
        HighScores scores = new HighScores();
        scores.insert("Shanson", 100);
        String[] printOut = scores.getScores();
        assertEquals("Shanson: 100", printOut[9]);
    }

    @Test
    void insertNine() {
        HighScores scores = new HighScores();
        scores.insert("Shanson", 100);
        scores.insert("Coleshine", 80);
        scores.insert("Joe", 75);
        scores.insert("JBalls", 70);
        scores.insert("Cobra", 60);
        scores.insert("Brandy", 60);
        scores.insert("Ale", 50);
        scores.insert("GODxUnknown", 40);
        scores.insert("Patheos", 1);

        String[] printOut = scores.getScores();
        assertEquals("Patheos: 1", printOut[1]);
        assertEquals("GODxUnknown: 40", printOut[2]);
        assertEquals("Ale: 50", printOut[3]);
        assertEquals("Brandy: 60", printOut[4]);
        assertEquals("Cobra: 60", printOut[5]);
        assertEquals("JBalls: 70", printOut[6]);
        assertEquals("Joe: 75", printOut[7]);
        assertEquals("Coleshine: 80", printOut[8]);
        assertEquals("Shanson: 100", printOut[9]);

    }

    @Test
    void insertEleven() {
        HighScores scores = new HighScores();
        scores.insert("Shanson", 100);
        scores.insert("Coleshine", 80);
        scores.insert("Joe", 75);
        scores.insert("JBalls", 70);
        scores.insert("Cobra", 60);
        scores.insert("Brandy", 60);
        scores.insert("Ale", 50);
        scores.insert("GODxUnknown", 40);
        scores.insert("Patheos", 1);
        scores.insert("Ngo", 1000);
        scores.insert("Done", 25);


        String[] printOut = scores.getScores();
        assertEquals("Done: 25", printOut[0]);
        assertEquals("GODxUnknown: 40", printOut[1]);
        assertEquals("Ale: 50", printOut[2]);
        assertEquals("Brandy: 60", printOut[3]);
        assertEquals("Cobra: 60", printOut[4]);
        assertEquals("JBalls: 70", printOut[5]);
        assertEquals("Joe: 75", printOut[6]);
        assertEquals("Coleshine: 80", printOut[7]);
        assertEquals("Shanson: 100", printOut[8]);
        assertEquals("Ngo: 1000", printOut[9]);

    }


}