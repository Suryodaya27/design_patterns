public class Car {
    private String engine;
    private String transmission;
    
    private boolean airbags;
    private boolean sunroof;
    private boolean gps;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.airbags = builder.airbags;
        this.sunroof = builder.sunroof;
        this.gps = builder.gps;
    }

        // Getters for the fields
        public String getEngine() {
            return engine;
        }
    
        public String getTransmission() {
            return transmission;
        }
    
        public boolean hasAirbags() {
            return airbags;
        }
    
        public boolean hasSunroof() {
            return sunroof;
        }
    
        public boolean hasGps() {
            return gps;
        }
    
        @Override
        public String toString() {
            return "Car [engine=" + engine + ", transmission=" + transmission 
                    + ", airbags=" + airbags + ", sunroof=" + sunroof 
                    + ", gps=" + gps + "]";
        }

    public static class CarBuilder {
        private String engine;
        private String transmission;
        private boolean airbags;
        private boolean sunroof;
        private boolean gps;

        public CarBuilder(String engine, String transmission) {
            this.engine = engine;
            this.transmission = transmission;
        }

        public CarBuilder airbags(boolean airbags) {
            this.airbags = airbags;
            return this;
        }

        public CarBuilder sunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder gps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}