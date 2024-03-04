package weekTwo.expeditors.backend.app;

import weekTwo.expeditors.backend.domain.Customer;

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer = new Customer(12, "Joe", "123 street", "123");

        System.out.println("customer created: " + customer.getCustomerId());
    }
}
