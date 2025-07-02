package com.Brunoyam.Module_8.Mod8Mid2;

public class Cheese extends Product {
    @Override
    public String toString() {
        return "Сыр";
    }

    private int volume = 2;

    @Override
    public int getVolume() {
        return volume;
    }
}
