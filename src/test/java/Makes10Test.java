import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Makes10Test {
    Makes10 m10 = new Makes10();

    @Test
    void makes10() {
        assertTrue(m10.makes10(9, 10));
        assertFalse(m10.makes10(9, 9));
        assertTrue(m10.makes10(1, 9));
        assertTrue(m10.makes10(10, 1));
        assertTrue(m10.makes10(10, 10));
        assertTrue(m10.makes10(8, 2));
        assertFalse(m10.makes10(8, 3));
        assertTrue(m10.makes10(10, 42));
        assertTrue(m10.makes10(12, -2));
    }
}