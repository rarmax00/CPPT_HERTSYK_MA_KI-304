package ki_304.Hertsyk.Lab6;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Клас, що реалізує трюм корабля.
 * @param <T> Тип елементів, які можна розміщувати у трюмі.
 */
public class ShipHold<T> {
    private ArrayList<T> items;

    /**
     * Конструктор для створення порожнього трюму.
     */
    public ShipHold() {
        items = new ArrayList<>();
    }

    /**
     * Додає елемент до трюму.
     * @param item Елемент для додавання.
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Видаляє елемент із трюму.
     * @param item Елемент для видалення.
     * @return true, якщо елемент було успішно видалено, інакше false.
     */
    public boolean removeItem(T item) {
        return items.remove(item);
    }

    /**
     * Повертає максимальний елемент у трюмі за заданим компаратором.
     * @param comparator Компаратор для визначення максимального елемента.
     * @return Максимальний елемент або null, якщо трюм порожній.
     */
    public T findMax(Comparator<? super T> comparator) {
        return items.stream().max(comparator).orElse(null);
    }

    /**
     * Повертає список усіх елементів у трюмі.
     * @return Список елементів.
     */
    public ArrayList<T> getItems() {
        return items;
    }
}

