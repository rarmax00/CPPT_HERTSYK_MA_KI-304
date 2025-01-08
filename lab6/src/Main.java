package ki_304.Hertsyk.Lab6;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Трюм для вантажів
        ShipHold<Cargo> cargoHold = new ShipHold<>();
        cargoHold.addItem(new Cargo("Steel", 500.0, 200.0));
        cargoHold.addItem(new Cargo("Coal", 300.0, 200.0));
        cargoHold.addItem(new Cargo("Oil", 700.0, 200.0));

        System.out.println("Вантажі у трюмі:");
        System.out.println(cargoHold.getItems());

        Cargo heaviestCargo = cargoHold.findMax(Comparator.comparingDouble(Cargo::getWeight));
        System.out.println("Найважчий вантаж: " + heaviestCargo);

        // Трюм для пасажирів
        ShipHold<Passenger> passengerHold = new ShipHold<>();
        passengerHold.addItem(new Passenger("Alice", 30));
        passengerHold.addItem(new Passenger("Bob", 45));
        passengerHold.addItem(new Passenger("Charlie", 25));

        System.out.println("Пасажири у трюмі:");
        System.out.println(passengerHold.getItems());

        Passenger oldestPassenger = passengerHold.findMax(Comparator.comparingInt(Passenger::getAge));
        System.out.println("Найстарший пасажир: " + oldestPassenger);
    }
}

