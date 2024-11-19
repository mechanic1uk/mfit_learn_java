package ru.chukhontsev.main;

import ru.chukhontsev.generic.Storage;
import ru.chukhontsev.geometric.Point;
import ru.chukhontsev.geometric.Point3D;
import ru.chukhontsev.people.Student;


public class Main {
    public static void main(String[] args) {

        Student first = new Student("Ivan", 5, 5, 5, 2, 2);
        Student second= new Student("Petya", 5, 5, 3, 5, 5);
        System.out.println(first.compare(second));

        Point p1 = new Point(5,15);
        Point p2 = new Point(10,25);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.length(p1));
        Point3D p3d = new Point3D(25,13,10);
        Point3D p3d2 = new Point3D(5,3,67);
        System.out.println(p3d);
        System.out.println(p3d2);
        System.out.println(p3d2.length(p3d));


    }


}