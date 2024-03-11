package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int MISSING_PRODUCT = -1;
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List<Product> products = new ArrayList<>();
    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 20);
    public static Product window = new Product("Window", 15);

    public static void main(String[] args) {
        var shipment = new Shipment();
        shipment.add(door);
        shipment.add(window);
        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();
        List<Product> lightvanProducts = shipment.getLightVanProducts();
        System.out.println("lightvanproducts: ");
        lightvanProducts.forEach(System.out::println);

        // can't do this now that we have changed these sublists to unmodifiableList instances
//        lightvanProducts.remove(window);
//        System.out.println("lightvanproducts: ");
//        lightvanProducts.forEach(System.out::println);
//        System.out.println("shipment");
//        shipment.forEach(System.out::println);
    }
    public void add(Product product) {
        products.add(product);
    }

    public boolean replace(Product oldProduct, Product newProduct) {
        if (products.contains(oldProduct)) {
            products.replaceAll(product -> product == oldProduct ? newProduct : product);
            return true;
        } else {
            return false;
        }
    //        int position = products.indexOf(oldProduct);
//        if (position == MISSING_PRODUCT) {
//            return false;
//        } else {
//            products.set(position, newProduct);
//            return true;
//        }
    }

    public void prepare() {
       // sort the product list
       products.sort(Product.BY_WEIGHT);

       // find the split point
       int splitPoint = findSplitPoint();

       // create two subviews of the list
        lightVanProducts = Collections.unmodifiableList(products.subList(0, splitPoint));
        heavyVanProducts = Collections.unmodifiableList(products.subList(splitPoint, products.size()));
    }

    private int findSplitPoint() {
        int size = products.size();
        for (int i = 0; i < size; i++)
        {
            var product = products.get(i);
            if (product.weight() > LIGHT_VAN_MAX_WEIGHT)
                return i;
        }
        return products.size();
    }

    public boolean stripHeavyProducts() {
        return products.removeIf(product -> product.weight() > LIGHT_VAN_MAX_WEIGHT);
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

   public Iterator<Product> iterator() { return products.iterator(); }



}
