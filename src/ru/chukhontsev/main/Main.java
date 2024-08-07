package ru.chukhontsev.main;


import ru.chukhontsev.mathematics.Fraction;
import ru.chukhontsev.mathematics.SummatorNumbers;
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
        }


}
