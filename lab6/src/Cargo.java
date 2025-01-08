package ki_304.Hertsyk.Lab6;

/**
* Клас, що представляє вантаж.
*/
public class Cargo {
private String name;
private double weight;

/**
 * Конструктор вантажу.
 *
 * @param name   Назва вантажу.
 * @param weight Вага вантажу.
 */
public Cargo(String name, double weight, double v) {
    this.name = name;
    this.weight = weight;
}

/**
 * Повертає вагу вантажу.
 * @return Вага вантажу.
 */
public double getWeight() {
    return weight;
}

@Override
public String toString() {
    return "Cargo{name='" + name + "', weight=" + weight + "}";
}
}

