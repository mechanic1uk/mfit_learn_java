package ru.chukhontsev.main;

import ru.chukhontsev.boxes.Box;
import ru.chukhontsev.geodesic.City;
import ru.chukhontsev.geometric.Line;
import ru.chukhontsev.geometric.Point;
import ru.chukhontsev.geometric.Polyline;
import ru.chukhontsev.mathematics.Fraction;
import ru.chukhontsev.mathematics.SummatorNumbers;
import ru.chukhontsev.people.Department;
import ru.chukhontsev.people.Employee;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


        Box<Integer> integerBox = new Box<>();
        // Кладем число 3 в коробку
        integerBox.put(3);

        // Извлекаем значение из коробки и выводим его на экран
        Integer value = integerBox.get();
        System.out.println("Извлеченное значение: " + value);

        // Проверяем, пуста ли коробка после извлечения
        System.out.println("Коробка пуста? " + integerBox.isEmpty());
    }


}