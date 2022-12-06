import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SleepInTest {
    SleepIn si = new SleepIn();

    @org.junit.jupiter.api.Test
    void sleepIn() {
        assertTrue(si.sleepIn(false, false));
        assertFalse(si.sleepIn(true, false));
        assertTrue(si.sleepIn(false, true));
        assertTrue(si.sleepIn(true, true));
    }
}