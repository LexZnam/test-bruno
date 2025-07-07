package com.Brunoyam.Module_8.Mod8Hard1;

/*Создайте свой диллерский центр.
Центр должен уметь получать новые автомобили и продавать.
Автомобили должны быть разные — от легковушки до тракторов.
Если нужного автомобиля нет, то центр должен выводить сообщение об этом.
Центр должен уметь предоставлять информацию обо всех своих автомобилях,
а также показывать “самый дорогой” и “самый дешёвый” автомобиль.*/

public class Main {
    public static void main(String[] args) {

        Transport[] tran = new Transport[10];
        tran[0] = new PassengerCar("JAC J7", 1300);
        tran[1] = new PassengerCar("Xiaomi SU7", 5500);
        tran[2] = new PassengerCar("Skoda Rapid", 1000);
        tran[3] = new PassengerCar("Lada (ВАЗ) 2114", 149);
        tran[4] = new CargoTruck("КамАЗ 65115", 4650);
        tran[5] = new CargoTruck("JAC N120", 4300);
        tran[6] = new CargoTruck("УРАЛ Next", 6210);
        tran[7] = new TankerTruck("Mitsubishi Fuso Canter TF молоковоз", 4200);
        tran[8] = new TankerTruck("МАЗ Moлокoвoз MAЗ АЦИП-14,5", 10025);
        tran[9] = new TankerTruck("УРАЛ 5557", 6200);

        DealershipCenter dealer = new DealershipCenter(20);

        dealer.listOfAllTransport();

        dealer.addTransport(tran[0]);
        dealer.addTransport(tran[1]);
        dealer.addTransport(tran[2]);
        dealer.addTransport(tran[3]);
        dealer.addTransport(tran[4]);
        dealer.addTransport(tran[5]);
        dealer.addTransport(tran[6]);
        dealer.addTransport(tran[7]);
        dealer.addTransport(tran[8]);
        dealer.addTransport(tran[9]);

        dealer.listOfAllTransport();

        dealer.findTransport("JAC J7");

        dealer.mostExpensiveAndChip();

        dealer.removeTransport(tran[0]);

        dealer.findTransport("JAC J7");

    }
}
