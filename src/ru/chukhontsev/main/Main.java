package ru.chukhontsev.main;

import ru.chukhontsev.generic.Storage;
import ru.chukhontsev.people.Student;


public class Main {
    public static void main(String[] args) {

        Student first = new Student("Ivan", 5, 5, 5, 5, 3);
        Student second= new Student("Petya", 5, 5, 3, 3, 3);
        System.out.println(first.compare(second));
    }


}