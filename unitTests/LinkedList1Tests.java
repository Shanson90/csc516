import static org.junit.jupiter.api.Assertions.assertEquals;

import homework.LinkedList1;
import org.junit.jupiter.api.Test;

class LinkedList1Tests {

    @Test
    void sortTest() {
        LinkedList1 list = new LinkedList1();
        list.add("shane");
        list.add("ale");
        list.add("joe");
        list.add("justin");
        list.add("collin");
        list.add("phil");

        assertEquals("ale", list.sort().value);

        assertEquals("ale", list.first.value);
        assertEquals("collin", list.first.next.value);
        assertEquals("joe", list.first.next.next.value);
        assertEquals("justin", list.first.next.next.next.value);
        assertEquals("phil", list.first.next.next.next.next.value);
        assertEquals("shane", list.last.value);
        assertEquals(6, list.size());
    }

    @Test
    void reverseTest() {
        LinkedList1 list = new LinkedList1();
        list.add("shane");
        list.add("ale");
        list.add("joe");
        list.add("justin");
        list.add("collin");
        list.add("phil");

        String firstOfReversed = list.reverse().value;
        assertEquals(firstOfReversed, "phil");
        assertEquals("phil", list.first.value);
        assertEquals("collin", list.first.next.value);
        assertEquals("justin", list.first.next.next.value);
        assertEquals("joe", list.first.next.next.next.value);
        assertEquals("ale", list.first.next.next.next.next.value);
        assertEquals("shane", list.last.value);
        assertEquals(6, list.size());
    }
}