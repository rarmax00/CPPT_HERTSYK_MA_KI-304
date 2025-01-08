package ki_304.Hertsyk.Lab_3;

/**
 * Клас Laptop представляє ноутбук і реалізує інтерфейс Portable.
 */
public class Laptop extends Computer implements Portable {
    private double screenSize;
    public static double batteryLife;

    /**
     * Конструктор для створення ноутбука з заданими параметрами.
     *
     * @param processor процесор ноутбука.
     * @param ram об'єм оперативної пам'яті у гігабайтах.
     * @param screenSize розмір екрана у дюймах.
     * @param batteryLife час роботи від батареї у годинах.
     */
    public Laptop(String processor, int ram, double screenSize, double batteryLife) {
        super(processor, ram, false);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    /**
     * Реалізація методу для відображення інформації про ноутбук.
     */
    @Override
    public void displayInfo() {
        System.out.println("Ноутбук з процесором " + processor + ", оперативною пам'яттю " + ram + "GB, діагоналлю " + screenSize + " дюймів та часом роботи від батареї " + batteryLife + " годин.");
    }

    /**
     * Реалізація методу carry() з інтерфейсу Portable.
     */
    @Override
    public void carry() {
        System.out.println("Ноутбук можна легко носити з собою.");
    }
}

