package com.Brunoyam.Module_8.Mod8Mid2;

public class Milk extends Product {
    @Override
    public String toString() {
        return "Молоко";
    }

    private int volume = 5;

    @Override
    public int getVolume() {
        return volume;
    }
}
