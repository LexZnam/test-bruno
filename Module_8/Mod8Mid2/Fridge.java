package com.Brunoyam.Module_8.Mod8Mid2;

public class Fridge {

    int lastOccupiedPlace = 0;
    int volumes;

    public Fridge(int volumes) {
        this.volumes = volumes;
    }

    void addProduct(Product product, int quantity) {
        int totalVolume = product.getVolume() * quantity;
        if (getFreeFridgesVolume() >= totalVolume) {
            System.out.println("Поместили в холодильник " + totalVolume + " " + product.toString());
            lastOccupiedPlace += totalVolume;
            System.out.println("В холодильнике " + getFreeFridgesVolume() + " свободного места");
            System.out.println("--------");
        } else {
            System.out.println("Поместить не получится, в холодильнике нет столько свовобного места");
            System.out.println("--------");
        }
    }

    int getFreeFridgesVolume() {
        return volumes - lastOccupiedPlace;
    }




}
