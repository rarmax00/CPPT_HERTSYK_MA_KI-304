package ki_304.Hertsyk.Lab_3;

/**
 * Абстрактний клас Computer представляє загальні риси комп'ютера.
 */
public abstract class Computer extends Object {
    protected String processor;
    protected int ram;
    protected boolean isOn;

    /**
     * Конструктор для створення комп'ютера з заданими параметрами.
     *
     * @param processor процесор комп'ютера.
     * @param ram об'єм оперативної пам'яті у гігабайтах.
     * @param isOn стан комп'ютера (увімкнений/вимкнений).
     */
    public Computer(String processor, int ram, boolean isOn) {
        this.processor = processor;
        this.ram = ram;
        this.isOn = isOn;
    }

    /**
     * Метод для увімкнення комп'ютера.
     */
    public void turnOn() {
        this.isOn = true;
        System.out.println("Комп'ютер увімкнено.");
    }

    /**
     * Метод для вимкнення комп'ютера.
     */
    public void turnOff() {
        this.isOn = false;
        System.out.println("Комп'ютер вимкнено.");
    }

    /**
     * Абстрактний метод для відображення інформації про комп'ютер.
     */
    public abstract void displayInfo();
}

