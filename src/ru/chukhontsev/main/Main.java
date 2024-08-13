package ru.chukhontsev.main;

import ru.chukhontsev.geometric.Line;
import ru.chukhontsev.geometric.Point;
import ru.chukhontsev.mathematics.Fraction;
import ru.chukhontsev.mathematics.SummatorNumbers;
import ru.chukhontsev.people.Department;
import ru.chukhontsev.people.Employee;

import java.math.BigInteger;



public class Main {
    public static void main(String[] args) {


            BigInteger bigInteger = new BigInteger("12345678912345678912");
            Fraction f = new Fraction(11, 3);
            Fraction f2 = new Fraction(21, 3);
            Fraction f3 = f;
            System.out.println(f.equals(f2));
            System.out.println();
            System.out.println(f.equals(f3));
            System.out.println();
            System.out.println(f3.equals(f2));
            System.out.println();
            Point p1 = new Point(12,22);
            Point p2 = new Point(12,22);
            System.out.print("Проверка на равенство точек" + p1.toString() +" "+p2.toString()+ "  ");
            System.out.println(p1.equals(p2));
            System.out.println();
            Line l1 = new Line(p1,p2);
            Line l2 = new Line(p1,p2);
            System.out.println(l1.equals(l2));
            l2 = new Line(p1,new Point(2,3));
            System.out.println(l1.equals(l2));





        }


}
