package ki_304.Hertsyk.Lab2;

import java.io.IOException;

/**
 * Клас WorkstationDriver є драйвером для демонстрації роботи класу Workstation.
 * Виконує основні операції з комп'ютером і монітором, такі як увімкнення/вимкнення та перевірка стану.
 */
public class WorkstationDriver {

    /**
     * Метод main є точкою входу в програму. Він демонструє основну функціональність класу Workstation.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            // Створюємо робочу станцію
            Workstation ws = new Workstation();

            // Увімкнення комп'ютера та монітора
            ws.turnOn();

            // Перевірка стану робочої станції
            ws.inspectWorkstation();

            // Вимкнення комп'ютера та монітора
            ws.turnOff();

            // Закриваємо логер
            ws.closeLogger();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

