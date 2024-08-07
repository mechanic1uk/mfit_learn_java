package ru.chukhontsev.main;

import ru.chukhontsev.mathematics.Fraction;
import ru.chukhontsev.mathematics.SummatorNumbers;
import ru.chukhontsev.people.Department;
import ru.chukhontsev.people.Employee;
import java.awt.Point;
import java.math.BigInteger;



public class Main {
    public static void main(String[] args) {
        if (args.length < 2) throw new IllegalArgumentException("Необходимо передать два числа в аргументах командной строки");

            BigInteger bigInteger = new BigInteger("12345678912345678912");
            Fraction f = new Fraction(11, 3);
            SummatorNumbers sm = new SummatorNumbers();
            Double res = sm.sumNumbers(7, f, 3.21, bigInteger);
            System.out.println(res);
            System.out.println(sm.power(args[0], args[1]));
            System.out.println(new ru.chukhontsev.geometric.Point(1,2));
            System.out.println(new Point());
            Department dep = new Department("OMT");
            Employee p1 = new Employee("Max");
            Employee p2 = new Employee("Pedro");
            Employee p3 = new Employee("Alvares");
            dep.addEmployee(p1);
            dep.addEmployee(p2);
            dep.addEmployee(p3);
            dep.setBoss(p2);
            dep.setBoss(p1);
            System.out.println(dep);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);



        }


}
