package com.Brunoyam.Module_8.Mod8Mid2;

public class Meat extends Product {
    @Override
    public String toString() {
        return "Мясо";
    }
    private int volume = 10;

    @Override
    public int getVolume() {
        return volume;
    }
}
