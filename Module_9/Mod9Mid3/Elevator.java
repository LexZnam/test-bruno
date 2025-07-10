package com.Brunoyam.Module_9.Mod9Mid3;

public class Elevator {
    private final int maxWeight = 500;
    private int nowWeight = 0;
    private Cargo cargos[];

    int getNowWeight() {
        return nowWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    Elevator(int size) {
        this.cargos = new Cargo[(size)];
    }

    int add(Cargo cargo) {
        boolean isEnable = false;
        for (int i = 0; i < cargos.length; i++) {
            if (cargo.getWeight() + getNowWeight() <= getMaxWeight() && cargos[i] == null) {
                nowWeight += cargo.getWeight();
                cargos[i] = cargo;
                checkNowWeight();
                isEnable = true;
                return i;
            }
        }
        if (!isEnable) {
            System.out.println("Не могу переложить груз в лифт. Лифт перегружен на " + (cargo.getWeight() + getNowWeight() - getMaxWeight()));
        }
        return -1;
    }

    void checkNowWeight() {
        System.out.println("Лифт сейчас загружен на: " + getNowWeight());
    }

    void push() {
        if (getMaxWeight() > getNowWeight()) {
            System.out.println("Лифт поехал");
        } else {
            System.out.println("Лифт перегружен");
        }
    }

    void pop() {
        for (int i = 0; i < cargos.length; i++) {
            cargos[i] = null;
        }
        System.out.println("Лифт разгружен");
    }
}
