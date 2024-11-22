package ru.chukhontsev.main;

import ru.chukhontsev.geometric.Line;
import ru.chukhontsev.geometric.Methods;
import ru.chukhontsev.geometric.Point;
import ru.chukhontsev.geometric.Point3D;
import ru.chukhontsev.people.Student;


public class Main {
    public static void main(String[] args) {

        Student first = new Student("Ivan", 5, 5, 5, 2, 2);
        Student second= new Student("Petya", 5, 5, 3, 5, 5);
        System.out.println(first.compare(second));

        Line<Point> l1 = new Line (new Point(1,2), new Point(4,5));
        System.out.println(l1);
        Methods moveLine = new Methods();
        moveLine.move(l1);
        System.out.println(l1);



    }


}