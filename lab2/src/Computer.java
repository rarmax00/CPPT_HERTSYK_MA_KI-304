package ki_304.Hertsyk.Lab2;

/**
 * Клас Computer представляє комп'ютер з певними характеристиками, такими як тип процесора, обсяг оперативної пам'яті та стан (увімкнений/вимкнений).
 */
public class Computer {
    private String processorType;
    private static int ramSize;
    private boolean isOn;

    /**
     * Конструктор за замовчуванням. Ініціалізує комп'ютер стандартними значеннями.
     */
    public Computer() {
        this.processorType = "Intel";
        this.ramSize = 8; // 8GB RAM за замовчуванням
        this.isOn = false; // Вимкнений за замовчуванням
    }

    /**
     * Конструктор для створення комп'ютера з вказаним типом процесора, обсягом оперативної пам'яті і станом.
     *
     * @param processorType тип процесора (наприклад, Intel, AMD).
     * @param ramSize обсяг оперативної пам'яті (у гігабайтах).
     * @param isOn початковий стан комп'ютера (true - увімкнений, false - вимкнений).
     */
    public Computer(String processorType, int ramSize, boolean isOn) {
        this.processorType = processorType;
        this.ramSize = ramSize;
        this.isOn = isOn;
    }

     /**
     * Метод для увімкнення комп'ютера.
     */
    public void turnOn() {
        isOn = true;
    }

    /**
     * Метод для вимкнення комп'ютера.
     */
    public void turnOff() {
        isOn = false;
    }

    /**
     * Повертає тип процесора комп'ютера.
     *
     * @return тип процесора.
     */
    public String getProcessorType() {
        return processorType;
    }

    /**
     * Встановлює тип процесора комп'ютера.
     *
     * @param processorType новий тип процесора.
     */
    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    /**
     * Повертає стан комп'ютера.
     *
     * @return true, якщо комп'ютер увімкнений, і false, якщо вимкнений.
     */
    public boolean isOn() {
        return isOn;
    }

    /**
     * Встановлює стан комп'ютера.
     *
     * @param on новий стан комп'ютера (true - увімкнений, false - вимкнений).
     */
    public void setOn(boolean on) {
        isOn = on;
    }

    /**
     * Повертає обсяг оперативної пам'яті комп'ютера.
     *
     * @return обсяг оперативної пам'яті (у гігабайтах).
     */
    public int getRamSize() {
        return ramSize;
    }

    /**
     * Встановлює обсяг оперативної пам'яті комп'ютера.
     *
     * @param ramSize новий обсяг оперативної пам'яті (у гігабайтах).
     */
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    /**
     * Повертає рядкове представлення об'єкта Computer.
     *
     * @return рядок, що представляє комп'ютер з його характеристиками.
     */
    @Override
    public String toString() {
        return "Computer{" +
                "processorType='" + processorType + '\'' +
                ", ramSize=" + ramSize +
                ", isOn=" + isOn +
                '}';
    }
}

