package weekly.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

    @Test
    public void TestFizzBuzz() {
        String result = FizzBuzz.main(new String[]{""});


        assertEquals(result, STR."""
                Times divisible by three: 333
                Times divisible by seven: 96
                """ );

    }
}
