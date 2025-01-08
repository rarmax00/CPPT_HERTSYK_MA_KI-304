package ki_304.Hertsyk.Lab2;

/**
 * Клас Monitor представляє монітор з певними характеристиками, такими як діагональ, роздільна здатність та стан (увімкнений/вимкнений).
 */
public class Monitor {
    private double screenSize; // Діагональ монітора в дюймах
    private String resolution; // Роздільна здатність
    private boolean isOn;

    /**
     * Конструктор за замовчуванням. Ініціалізує монітор стандартними значеннями.
     */
    public Monitor() {
        this.screenSize = 24; // 24 дюйми за замовчуванням
        this.resolution = "1920x1080"; // Стандартна роздільна здатність
        this.isOn = false; // Вимкнений за замовчуванням
    }

    /**
     * Конструктор для створення монітора з вказаною діагоналлю та роздільною здатністю.
     *
     * @param screenSize діагональ монітора в дюймах.
     * @param resolution роздільна здатність (наприклад, 1920x1080).
     * @param isOn стан монітора (true - увімкнений, false - вимкнений).
     */
    public Monitor(double screenSize, String resolution, boolean isOn) {
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.isOn = isOn;
    }

     /**
     * Метод для увімкнення монітора.
     */
    public void turnOn() {
        isOn = true;
    }

    /**
     * Метод для вимкнення монітора.
     */
    public void turnOff() {
        isOn = false;
    }

    /**
     * Повертає діагональ монітора.
     *
     * @return діагональ монітора в дюймах.
     */
    public double getScreenSize() {
        return screenSize;
    }

    /**
     * Встановлює нову діагональ монітора.
     *
     * @param screenSize нова діагональ в дюймах.
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * Повертає роздільну здатність монітора.
     *
     * @return роздільна здатність монітора.
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Встановлює нову роздільну здатність монітора.
     *
     * @param resolution нова роздільна здатність.
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Повертає стан монітора.
     *
     * @return true, якщо монітор увімкнений, і false, якщо вимкнений.
     */
    public boolean isOn() {
        return isOn;
    }

    /**
     * Повертає рядкове представлення об'єкта Monitor.
     *
     * @return рядок, що представляє монітор з його характеристиками.
     */
    @Override
    public String toString() {
        return "Monitor{" +
                "screenSize=" + screenSize +
                ", resolution='" + resolution + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}

