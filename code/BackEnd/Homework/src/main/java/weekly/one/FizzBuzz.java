package weekly.one;

public class FizzBuzz {
    public static String main(String[] args) {
        int count = -500;
        int threeCount = 0;
        int sevenCount = 0;
        while(count <= 500) {
            if (count % 3 == 0) {
                threeCount++;
            } else if (count % 7 == 0) {
                sevenCount++;
            }
            count++;
        }
        return STR."""
                Times divisible by three: \{threeCount}
                Times divisible by seven: \{sevenCount}
                """;
    }


}
