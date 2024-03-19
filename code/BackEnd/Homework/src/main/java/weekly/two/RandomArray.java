package weekly.two;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5, 10)));
    }

    public static int [] createArray(int size, int limit) {
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(limit);
        }
        return arr;
    }
}
