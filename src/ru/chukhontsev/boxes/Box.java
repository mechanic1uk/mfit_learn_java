package ru.chukhontsev.boxes;

// Обобщенный класс Box
public class Box <T> {
    private T object;

    // Метод для помещения объекта в коробку
    public void put(T object) {
        if (this.object != null) {
            throw new IllegalStateException("Коробка уже заполнена!");
        }
        this.object = object;
    }

    // Метод для извлечения объекта из коробки
    public T get() {
        T temp = this.object;
        this.object = null; // Обнуляем ссылку на объект
        return temp;
    }

    // Метод для проверки, пустая ли коробка
    public boolean isEmpty() {
        return this.object == null;
    }
}




