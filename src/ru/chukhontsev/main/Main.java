package ru.chukhontsev.main;

import ru.chukhontsev.generic.Storage;


public class Main {
    public static void main(String[] args) {

        Storage<Integer> StorageNull = new Storage<>(null, 0);
        System.out.println("Полученное значение: " + StorageNull.getObject()); // Должно вернуть 0

        Storage <Integer> Storage99 = new Storage<>(99, -1);
        System.out.println("Полученное значение: " + Storage99.getObject()); // Должно вернуть 99

        Storage <String> StorageNullStr = new Storage<>(null, "default");
        System.out.println("Полученное значение: " + StorageNullStr.getObject()); // Должно вернуть "default"

        Storage <String> StorageHello = new Storage<>("hello", "hello world");
        System.out.println("Полученное значение: " + StorageHello.getObject()); // Должно вернуть "hello"

    }


}