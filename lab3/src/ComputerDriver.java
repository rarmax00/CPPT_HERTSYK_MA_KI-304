
package ki_304.Hertsyk.Lab_3;

import java.io.IOException;

/**
 * Клас WorkstationDriver демонструє роботу класу Laptop.
 */
public class ComputerDriver {

    /**
     * Метод main є точкою входу в програму.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            // Створення ноутбука
            Laptop laptop = new Laptop("Intel i7", 16, 15.6, 8);

            // Увімкнення ноутбука
            laptop.turnOn();

            // Відображення інформації про ноутбук
            laptop.displayInfo();

            // Перевірка портативності
            laptop.carry();

            // Вимкнення ноутбука
            laptop.turnOff();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
