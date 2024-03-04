package weekly.one;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle.VehicleBuilder builder = new Vehicle.VehicleBuilder();
        builder.addVin(100000)
                .addMakeAndModel("Honda CRV")
                .addColor("white")
                .addTowing(false)
                .addOdometer(127500)
                .addPrice(27500.95)
                .addQuality(Vehicle.VehicleBuilder.Quality.B);

        // resulting vehicle is now immutable
        Vehicle vehicle = builder.build();


        System.out.println(STR."""
          Vehicle stats:
          vin: \{vehicle.getVin()}
          make and model: \{vehicle.getMakeAndModel()}
          color: \{vehicle.getColor()}
          towing: \{vehicle.getTowing()}
          odometer reading: \{vehicle.getOdometer()}
          price: $\{vehicle.getPrice()}
          quality rating: \{vehicle.getQuality()}
            """
        );
    }
}
