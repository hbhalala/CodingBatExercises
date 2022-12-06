import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDoubleTest {

    SumDouble sd = new SumDouble();

    @Test
    void sumDouble() {
        assertEquals(3, sd.sumDouble(1, 2));
        assertEquals(5, sd.sumDouble(3, 2));
        assertEquals(8, sd.sumDouble(2, 2));
        assertEquals(-1, sd.sumDouble(-1, 0));
        assertEquals(12, sd.sumDouble(3, 3));
        assertEquals(0, sd.sumDouble(0, 0));
        assertEquals(1, sd.sumDouble(0, 1));
        assertEquals(7, sd.sumDouble(3, 4));
    }
}