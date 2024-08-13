package ru.chukhontsev.main;

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


        Fraction f = new Fraction(1, 2);
        System.out.println(f);

        Fraction f2 = (Fraction) f.clone();
        System.out.println(f2);
        System.out.println(f2.equals(f));
        System.out.println(f.equals(f2));

        Point p1 = new Point(2, 5);
        Point p2 = p1.clone();

        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p2);
        System.out.println(p2.equals(p1));

        Line l1 = new Line(p1, p2);
        Line l2 = l1.clone();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l1));


    }
}
