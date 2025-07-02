package com.Brunoyam.Module_8;

public class Mod8Easy1 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[10];

        animals[0] = new Tiger();
        animals[1] = new Lion();
        animals[2] = new Elephant();
        animals[3] = new Monkey();
        animals[4] = new Snake();
        animals[5] = new Parrot();
        animals[6] = new Penguin();
        animals[7] = new Bear();
        animals[8] = new Giraffe();
        animals[9] = new Zebra();

        for (Animal animal : animals) {
            animal.say();
            animal.walk();
        }
    }
}

abstract class Animal {

    public abstract void walk();

    public abstract void say();
}


class Tiger extends Animal {
    public void walk() {
        System.out.println("The tiger prowls stealthily through the grass.");
    }

    public void say() {
        System.out.println("Grrrr!");
    }
}

class Lion extends Animal {
    public void walk() {
        System.out.println("The lion strides powerfully.");
    }

    public void say() {
        System.out.println("Roar!");
    }
}

class Elephant extends Animal {
    public void walk() {
        System.out.println("The elephant lumbers slowly.");
    }

    public void say() {
        System.out.println("Trumpet!");
    }
}

class Monkey extends Animal {
    public void walk() {
        System.out.println("The monkey swings and hops.");
    }

    public void say() {
        System.out.println("Ooh ooh aah aah!");
    }
}

class Snake extends Animal {
    public void walk() {
        System.out.println("The snake slithers silently.");
    }

    public void say() {
        System.out.println("Hiss!");
    }
}

class Parrot extends Animal {
    public void walk() {
        System.out.println("The parrot hops from perch to perch.");
    }

    public void say() {
        System.out.println("Squawk!");
    }
}

class Penguin extends Animal {
    public void walk() {
        System.out.println("The penguin waddles adorably.");
    }

    public void say() {
        System.out.println("Honk!");
    }
}

class Bear extends Animal {
    public void walk() {
        System.out.println("The bear lumbers with heavy steps.");
    }

    public void say() {
        System.out.println("Growl!");
    }
}

class Giraffe extends Animal {
    public void walk() {
        System.out.println("The giraffe walks gracefully with long strides.");
    }

    public void say() {
        System.out.println("Hum!");
    }
}

class Zebra extends Animal {
    public void walk() {
        System.out.println("The zebra trots like a horse.");
    }

    public void say() {
        System.out.println("Whinny!");
    }
}