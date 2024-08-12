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
            Fraction f2 = new Fraction(21, 3);
            Fraction f3 = f;
            System.out.println(f.equals(f2));
            System.out.println();
            System.out.println(f.equals(f3));
            System.out.println();
            System.out.println(f3.equals(f2));




        }


}
