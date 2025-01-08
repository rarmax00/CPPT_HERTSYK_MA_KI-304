package ki_304.Hertsyk.Lab6;

/**
 * Клас, що представляє пасажира.
 */
public class Passenger {
    private String name;
    private int age;

    /**
     * Конструктор пасажира.
     * @param name Ім'я пасажира.
     * @param age Вік пасажира.
     */
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Повертає вік пасажира.
     * @return Вік пасажира.
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Passenger{name='" + name + "', age=" + age + "}";
    }
}

