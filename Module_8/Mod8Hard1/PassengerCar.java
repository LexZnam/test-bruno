package Mod8Hard1;

public class PassengerCar extends Transport {

    public PassengerCar(String brand, int price) {
        super(brand, price);
            }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String toString() {
        return "Легковой автомобиль";
    }
}
