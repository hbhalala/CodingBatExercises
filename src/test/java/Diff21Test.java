import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {

    Diff21 df21 = new Diff21();

    @Test
    void diff21() {
        assertEquals(2, df21.diff21(19));
        assertEquals(11, df21.diff21(10));
        assertEquals(0, df21.diff21(21));
        assertEquals(2, df21.diff21(22));
        assertEquals(8, df21.diff21(25));
        assertEquals(18, df21.diff21(30));
        assertEquals(21, df21.diff21(0));
        assertEquals(20, df21.diff21(1));
        assertEquals(19, df21.diff21(2));
        assertEquals(22, df21.diff21(-1));
        assertEquals(23, df21.diff21(-2));
        assertEquals(58, df21.diff21(50));
    }
}