package com.Brunoyam.Module_9.Mod9Mid2;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(10);
        Car[] car = new Car[20];
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
        }
        parking.checkFreeParkingSpace();

        parking.pushCar(car[0]);
        parking.pushCar(car[1]);
        parking.pushCar(car[2]);
        parking.pushCar(car[3]);
        parking.pushCar(car[4]);
        parking.pushCar(car[5]);
        parking.pushCar(car[6]);
        parking.pushCar(car[7]);
        parking.pushCar(car[8]);
        parking.pushCar(car[9]);

        parking.pushCar(car[10]);

        parking.popCar(car[0]);
        parking.pushCar(car[10]);

        parking.popCar(car[19]);


    }
}
