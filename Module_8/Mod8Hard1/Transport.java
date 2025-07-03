package Mod8Hard1;

public abstract class Transport {

    int price;
    String brand;

    public Transport(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Транспорт";
    }
}

