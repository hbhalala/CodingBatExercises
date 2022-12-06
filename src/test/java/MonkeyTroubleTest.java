import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonkeyTroubleTest {

    MonkeyTrouble mt = new MonkeyTrouble();

    @Test
    void monkeyTrouble() {
        assertTrue(mt.monkeyTrouble(true, true));
        assertTrue(mt.monkeyTrouble(false, false));
        assertFalse(mt.monkeyTrouble(true, false));
        assertFalse(mt.monkeyTrouble(false, true));
    }
}