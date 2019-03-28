import homework.StringReverser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringReverserTests {

    @Test
    void shane() {
        String actual = StringReverser.reverse("shane");
        assertEquals("enahs", actual);
    }

    @Test
    void alejandra() {
        String actual = StringReverser.reverse("alejandra");
        assertEquals("ardnajela", actual);
    }

    @Test
    void empty() {
        String actual = StringReverser.reverse("");
        assertEquals("", actual);
    }
}