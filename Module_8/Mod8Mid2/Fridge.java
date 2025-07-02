package com.Brunoyam.Module_8.Mod8Mid2;

public class Fridge {
    Product[] products;

    public Fridge(int size) {
        this.products = new Product[size];
    }

    void addProduct(Product product, int quantity) {
        int totalVolume = product.getVolume() * quantity;
        if (getFreeFridgesVolume() >= totalVolume) {
            System.out.println("Поместили в холодильник " + totalVolume);
            for (int q = 0; q < totalVolume; q++) {
                for (int i = 0; i < products.length; i++) {
                    if (products[i] == null) {
                        products[i] = product;
                        break;
                    }
                }
            }
            System.out.println("В холодильнике " + getFreeFridgesVolume() + " свободного места");
            System.out.println("--------");
        } else {
            System.out.println("Поместить не получится, в холодильнике нет столько свовобного места");
            System.out.println("--------");
        }
    }

    int getFreeFridgesVolume() {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                count++;
            }
        }
        return count;
    }




}
