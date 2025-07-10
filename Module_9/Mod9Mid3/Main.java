package com.Brunoyam.Module_9.Mod9Mid3;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(10);
        Cargo cargo1 = new Cargo(100);
        Cargo cargo2 = new Cargo(200);
        Cargo cargo3 = new Cargo(150);
        Cargo cargo4 = new Cargo(250);

        elevator.add(cargo1);
        elevator.add(cargo2);
        elevator.add(cargo3);
        elevator.add(cargo4);

        elevator.push();

        elevator.pop();


    }

}
