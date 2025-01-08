package ki_304.Hertsyk.Lab2;

import java.io.IOException;

/**
 * Клас Workstation реалізує робочу станцію з комп'ютером, монітором та його компонентами.
 */
public class Workstation {
    private Computer computer;
    private Monitor monitor;
    private Logger logger;

    /**
     * Конструктор за замовчуванням, що створює комп'ютер і монітор з типовими параметрами.
     *
     * @throws IOException якщо виникає помилка під час створення або роботи з лог-файлом.
     */
    public Workstation() throws IOException {
        this(new Computer("Intel", 16, false), new Monitor(24, "1920x1080", false));
        this.logger = new Logger("workstation_log.txt");

        logger.log(String.format("Робоча станція %s створена.", this.toString()));
    }

    /**
     * Конструктор з параметрами для створення робочої станції з конкретним комп'ютером і монітором.
     *
     * @param computer об'єкт типу Computer.
     * @param monitor об'єкт типу Monitor.
     * @throws IOException якщо виникає помилка під час створення або роботи з лог-файлом.
     */
    public Workstation(Computer computer, Monitor monitor) throws IOException {
        this.computer = computer;
        this.monitor = monitor;
        this.logger = new Logger("workstation_log.txt");

        logger.log(String.format("Робоча станція %s створена.", this.toString()));
    }

    /**
     * Метод для увімкнення комп'ютера та монітора.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void turnOn() throws IOException {
        computer.turnOn();
        monitor.turnOn();
        logger.log("Комп'ютер і монітор увімкнено.");
    }

    /**
     * Метод для вимкнення комп'ютера та монітора.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void turnOff() throws IOException {
        computer.turnOff();
        monitor.turnOff();
        logger.log("Комп'ютер і монітор вимкнено.");
    }

    /**
     * Метод для перевірки стану робочої станції.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void inspectWorkstation() throws IOException {
        var inspectionReport = String.format("Огляд робочої станції:\n Комп'ютер - %s\n Монітор - %s", computer.toString(), monitor.toString());
        logger.log(String.format("Відбувся %s", inspectionReport));
    }

    /**
     * Повертає об'єкт типу Computer.
     *
     * @return об'єкт типу Computer.
     */
    public Computer getComputer() {
        return computer;
    }

    /**
     * Встановлює новий об'єкт типу Computer.
     *
     * @param computer новий об'єкт комп'ютера.
     */
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    /**
     * Повертає об'єкт типу Monitor.
     *
     * @return об'єкт типу Monitor.
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * Встановлює новий об'єкт типу Monitor.
     *
     * @param monitor новий об'єкт монітора.
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    /**
     * Метод для коректного закриття логера.
     *
     * @throws IOException якщо виникає помилка під час закриття лог-файлу.
     */
    public void closeLogger() throws IOException {
        logger.close();
    }

    /**
     * Повертає рядкове представлення об'єкта Workstation.
     *
     * @return рядок, що представляє робочу станцію.
     */
    @Override
    public String toString() {
        return "Workstation{" +
                "computer=" + computer +
                ", monitor=" + monitor +
                '}';
    }
}

