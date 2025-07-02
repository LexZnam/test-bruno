package com.Brunoyam.Module_8.Mod8Mid2;

public class Main {
    public static void main(String[] args) {
        Product meat = new Meat();
        Product milk = new Milk();
        Product cheese = new Cheese();

        Fridge fridge = new Fridge(100);

        fridge.addProduct(meat, 2);
        fridge.addProduct(milk, 5);
        fridge.addProduct(cheese, 2);
        fridge.addProduct(meat, 5);

        fridge.addProduct(meat, 5);



        //fridge.checkFriedges();





    }
}
