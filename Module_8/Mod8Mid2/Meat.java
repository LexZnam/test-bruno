package com.Brunoyam.Module_8.Mod8Mid2;

public class Meat extends Product {

    private int volume = 10;

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Мясо";
    }
}
