package time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLocalTimeApp {

    @Test
    public void testRemainderApp() {
        int a = 10;
        int b = 11;

        int result = LocalTimeApp.getRemainder(a,b);
        assertEquals(10, result);
    }

}
