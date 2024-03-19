package weekly.one;

public class Vehicle {
    public static class VehicleBuilder {
        private int vin;
        private String makeAndModel;
        private String color;
        private boolean towing;
        private int odometer;

        private double price;
        private Quality quality;
        enum Quality {
            A,
            B,
            C

        }
        public VehicleBuilder () {}

        public Vehicle build () {
            return new Vehicle(this);
        }

        public VehicleBuilder addVin (int vin) {
            this.vin = vin;
            return this;
        }

        public VehicleBuilder addMakeAndModel (String makeAndModel) {
            this.makeAndModel = makeAndModel;
            return this;
        }
        public VehicleBuilder addColor (String color) {
            this.color = color;
            return this;
        }

        public VehicleBuilder addTowing (boolean towing) {
            this.towing = towing;
            return this;
        }
        public VehicleBuilder addOdometer (int odometer) {
            this.odometer = odometer;
            return this;
        }
        public VehicleBuilder addPrice (double price) {
            this.price = price;
            return this;
        }
        @SuppressWarnings("UnusedReturnValue")
        public VehicleBuilder addQuality (Quality quality) {
            this.quality = quality;
            return this;
        }
    }

    private int vin;
    private String makeAndModel;
    private String color;
    private boolean towing;
    private int odometer;
    private double price;
    private final VehicleBuilder.Quality quality;
    public Vehicle (VehicleBuilder builder) {
        this.vin = builder.vin;
        this.makeAndModel = builder.makeAndModel;
        this.color = builder.color;
        this.towing = builder.towing;
        this.odometer = builder.odometer;
        this.price = builder.price;
        this.quality = builder.quality;
    }
    public int getVin() { return vin; }
    public String getMakeAndModel () { return makeAndModel; }
    public String getColor () { return color; }
    public boolean getTowing () { return towing; }
    public int getOdometer () { return odometer; }
    public double getPrice () { return price; }
    public VehicleBuilder.Quality getQuality () { return quality; }
}
