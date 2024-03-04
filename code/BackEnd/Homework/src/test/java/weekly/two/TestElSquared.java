package weekly.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestElSquared {
    @Test
    public void TestElSquared() {
        int [] result = ElSquared.main();

        assertEquals(result[0], 0);
        assertEquals(result[2], 4);
        assertEquals(result[3], 9);
        assertEquals(result[4], 16);
        assertEquals(result[9], 81);
        assertEquals(result[7], 49);


    }
}
