package Mod8Hard1;

public class DealershipCenter {
    Transport[] transports;

    public DealershipCenter(int size) {
        this.transports = new Transport[size];
    }

    int addTransport(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) {
                transports[i] = transport;
                System.out.println(transports[i].getBrand() + " добавлен");
                return i;
            }

        }
        return -1;
    }

    int removeTransport(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i].getBrand().equalsIgnoreCase(transport.getBrand())) {
                System.out.println("Транспорт " + transports[i].toString() + " " + transports[i].getBrand() + " - удален");
                transports[i] = null;
                return i;
            }

        }
        return -1;
    }

    void findTransport(String transport) {
        boolean find = false;
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] != null && transports[i].getBrand().equalsIgnoreCase(transport)) {
                System.out.println("Найден " + transports[i].getBrand());
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("В центре нет " + transport);
        }
    }

    void listOfAllTransport() {
        boolean find = false;
        int totalTransport = 0;
        System.out.println("----");
        System.out.println("В центре находится следующий транспорт:");
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] != null) {
                System.out.println(transports[i].toString() + " - " + transports[i].getBrand() + ". Цена: " + transports[i].getPrice());
                find = true;
                totalTransport++;
            }
        }
        if (find) {
            System.out.println("Всего найдено транспортных средств: " + totalTransport);
        } else {
            System.out.println("В дилерском центре ничего нет");
        }
        System.out.println("----");

    }

    void mostExpensiveAndChip() {
        int maxPrice = 0;
        int maxPriceNumber = 0;
        int minPrice = 0;
        int minPriceNumber = 0;

        for (int i = 0; i < transports.length; i++) {
            if (transports[i] != null && transports[i].getPrice() > maxPrice) {
                maxPrice = transports[i].getPrice();
                maxPriceNumber = i;
            }
            if (transports[i] != null && minPrice == 0) {
                minPrice = transports[i].getPrice();
                minPriceNumber = i;
            }
            if (transports[i] != null && transports[i].getPrice() < minPrice) {
                minPrice = transports[i].getPrice();
                minPriceNumber = i;
            }
        }
        System.out.println("Самый дорогое транспортное средство: " + transports[maxPriceNumber].toString() + " - " + transports[maxPriceNumber].getBrand() + ". Цена: " + transports[maxPriceNumber].getPrice());
        System.out.println("Самый дешевое транспортное средство: " + transports[minPriceNumber].toString() + " - " + transports[minPriceNumber].getBrand() + ". Цена: " + transports[minPriceNumber].getPrice());
    }
}
