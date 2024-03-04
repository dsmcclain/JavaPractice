package weekTwo;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        listDemo();
    }

    public static void listDemo() {
        // lists are nice because you don't need to specify a size beforehand like with Arrays
        // ArrayList is essentially just an array with some automatic resizing under the hood
        List<Integer> linit = new ArrayList<>();
        linit.add(10);
        linit.add(5);

        int firstInt = linit.getFirst();
        int anInt = linit.get(1);

        // sets cannot be accessed by index, but it does not allow duplicates
        Set<Integer> aSet = new HashSet<>();

        // key value pair
        Map<String, Integer> aMap = new HashMap<>();

        // enhanced for-loop
        for(int val : linit) {
            System.out.println(val);
        }

    }

}
