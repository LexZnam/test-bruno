package com.Brunoyam.Module_9.Mod9Mid2;

public class Parking {
    private Car cars[];
    private int freeParkingSpaces;

    Parking(int size) {
        this.cars = new Car[(size)];
        freeParkingSpaces = size;
    }

    int getFreeParkingSpaces() {
        return freeParkingSpaces;
    }

    int pushCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (freeParkingSpaces == 0) {
                System.out.println("нет свободных мест на парковке");
                return -1;
            } else if (cars[i] == null) {
                cars[i] = car;
                freeParkingSpaces--;
                checkFreeParkingSpace();
                return i;
            }
        }
        return -1;
    }

    int popCar(Car car) {
        boolean found = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == car) {
                freeParkingSpaces++;
                checkFreeParkingSpace();
                found = true;
                return i;
            }
        }
        if (!found) {
            System.out.println("такой машины нет на парковке");
        }
        return -1;
    }

    void checkFreeParkingSpace() {
        System.out.println("осталось свободных мест: " + getFreeParkingSpaces());
    }

}
