public class Electronic extends Product {

        private double battery;
        public Electronic(int id, String name, double price, int quantity, double battery) {
            super(name, price, id, quantity);
            this.battery = battery;
        }

        @Override
        public String toString() {
            return super.toString() + ", Type: Electronics, Battery: " + battery;
        }
    }