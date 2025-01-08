package ki_304.Hertsyk.Lab4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас ExpressionCalculator реалізує метод обчислення математичного виразу
 * y = ctg(x) / sin(7x - 1) з обробкою можливих помилок.
 *
 * @version 1.1
 */
public class ExpressionCalculator {

    /**
     * Обчислює значення функції y = ctg(x) / sin(7x - 1) для заданого значення x.
     *
     * @param x значення змінної x
     * @return обчислене значення y
     * @throws ArithmeticException якщо tan(x) або sin(7x - 1) дорівнюють нулю
     */
    public double calculate(double x) throws ArithmeticException {
        double tanX = Math.tan(x);

        if (tanX == 0) {
            throw new ArithmeticException("Помилка: тангенс значення x дорівнює нулю. Обчислення котангенса неможливе.");
        }

        double ctgX = 1 / tanX;
        double sinValue = Math.sin(7 * x - 1);

        if (sinValue == 0) {
            throw new ArithmeticException("Помилка: синус значення (7x - 1) дорівнює нулю. Ділення на нуль неможливе.");
        }

        return ctgX / sinValue;
    }

    /**
     * Записує результат обчислення у файл.
     *
     * @param result значення, яке буде записане у файл
     * @param fileName назва файлу
     * @throws IOException якщо виникає помилка запису у файл
     */

    public void writeResultToFile(Double result, String errorMessage, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            if (errorMessage != null) {
                writer.write("Помилка обчислення: " + errorMessage);
            } else {
                writer.write("Результат обчислення: " + result);
            }
        }
    }


    public static void main(String[] args) {
        ExpressionCalculator calculator = new ExpressionCalculator();
        double x = 0,78; // приклад значення

        try {
            double result = calculator.calculate(x);
            System.out.println("Результат обчислення: " + result);
            calculator.writeResultToFile(result, null, "result.txt");
            System.out.println("Результат успішно записаний у файл 'result.txt'.");
        } catch (ArithmeticException e) {
            System.err.println("Помилка обчислення: " + e.getMessage());
            try {
                calculator.writeResultToFile(null, e.getMessage(), "result.txt");
            } catch (IOException ioException) {
                System.err.println("Не вдалося записати повідомлення про помилку у файл: " + ioException.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }

}

