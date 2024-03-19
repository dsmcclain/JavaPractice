package SecondExample;

public class SecondShot {
    public static void main(String[] args) {
        javaControlFlow(12);
        javaControlFlow(4);
    }

    public static void types() {
        boolean aBool = true; // 8 bits

        //integral types
        byte aByte = 127; // 8 bits
        short aShort = 32767; // 16 bits
        int aInt = 229999999; // 32 bits
        long aLong = 1234567890; // 64 bits

        // floating point types
        // float afloat = (float)12.34
        float aFloat = 12.45F; // 32 bits
        double aDouble = 34.56; //64 bits


        char aChar = 'c'; // 16 bits
        // String class is just an array of characters

        char [] cArray = new char[10];
    }

    public static void javaControlFlow(Integer limit) {
        String length;
        if(limit < 10) {
            length = "small";
        } else if(limit < 100) {
            length = "large";
        }

        String length2 = switch(limit) {
            case Integer i when i < 10 -> "small";
            case Integer i when i < 100 -> "medium";
            default -> "bigz";
        };
    }
}
