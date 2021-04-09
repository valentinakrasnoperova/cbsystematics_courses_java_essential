package homework7.add_task;

public enum Vehicles {
    BMW(100000) {
        @Override
        public String getColor() {
            return "White";
        }
    }, MAZDA(50000) {
        @Override
        public String getColor() {
            return "Red";
        }
    }, TOYOTA(30000) {
        @Override
        public String getColor() {
            return "Black";
        }
    };
    int price;

    Vehicles(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name is :" + this.name() + ", price is :" + price + ", color is : " + getColor();
    }

    public abstract String getColor();
}
