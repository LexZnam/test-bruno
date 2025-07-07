package com.Brunoyam.Module_8.Mod8Hard1;

public class CargoTruck extends Transport {
    public CargoTruck(String brand, int price) {
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
        return "Грузовой автомобиль";
    }
}
