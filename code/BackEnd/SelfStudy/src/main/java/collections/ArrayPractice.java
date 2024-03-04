package collections;
/*
Collection API inherits from the Iterable API
size()
isEmpty()
add()
addAll()
remove(element)
removeAll(element)
retainAll(element)
contains(element)
containsAll(collection)
clear()
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayPractice {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 20);
        Product window = new Product("Window", 15);

        Collection<Product> products = new ArrayList<>();
        //var products = new ArrayList<Products>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        System.out.println(products);

        Iterator<Product> it = products.iterator();
        while (it.hasNext()) {
            var product = it.next();
            if (product.weight() > 20) {
                it.remove();
            };
        }

        System.out.println(products);
        System.out.println(products.contains(window));
        products.remove(window);
        System.out.println(products.contains(window));
//
//        //create
//        Product[] products = { door, floorPanel };
//        System.out.println(Arrays.toString(products));
//
//        //add
//        products = add(window, products);
//        System.out.println(Arrays.toString(products));
//
//        //duplicate
//        products = add(window, products);
//        System.out.println(Arrays.toString(products));
    }

    private static Product[] add(Product product, Product[] array) {
        int length = array.length;
        var newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
