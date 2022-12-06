import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTroubleTest {

    ParrotTrouble pt = new ParrotTrouble();

    @Test
    void parrotTrouble() {
        assertTrue(pt.parrotTrouble(true, 6));
        assertFalse(pt.parrotTrouble(true, 7));
        assertFalse(pt.parrotTrouble(false, 6));
        assertTrue(pt.parrotTrouble(true, 21));
        assertFalse(pt.parrotTrouble(false, 21));
        assertFalse(pt.parrotTrouble(false, 20));
        assertTrue(pt.parrotTrouble(true, 23));
        assertFalse(pt.parrotTrouble(false, 23));
        assertFalse(pt.parrotTrouble(true, 20));
        assertFalse(pt.parrotTrouble(false, 12));
    }
}