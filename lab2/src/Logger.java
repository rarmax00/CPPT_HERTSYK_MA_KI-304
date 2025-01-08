package ki_304.Hertsyk.Lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Клас Logger реалізує систему логування для запису подій у файл.
 */
public class Logger {
    private BufferedWriter writer;

    /**
     * Конструктор класу Logger, що відкриває лог-файл для запису.
     *
     * @param fileName ім'я файлу для збереження логів.
     * @throws IOException якщо виникає помилка при відкритті файлу.
     */
    public Logger(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName, true));
    }

    /**
     * Метод для запису повідомлення у лог-файл.
     *
     * @param message повідомлення для запису.
     * @throws IOException якщо виникає помилка при запису у файл.
     */
    public void log(String message) throws IOException {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logMessage = "[" + timestamp + "] " + message;
        writer.write(logMessage + "\n");
        writer.flush();
        System.out.println(logMessage); // Додати вивід у консоль
    }

    /**
     * Метод для закриття лог-файлу.
     *
     * @throws IOException якщо виникає помилка при закритті файлу.
     */
    public void close() throws IOException {
        writer.close();
    }
}

