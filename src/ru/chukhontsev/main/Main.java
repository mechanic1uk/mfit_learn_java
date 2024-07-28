package ru.chukhontsev.main;


import ru.chukhontsev.mathematics.Fraction;
import ru.chukhontsev.mathematics.NumberSummable;
import ru.chukhontsev.mathematics.SummatorNumbers;

import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {

    BigInteger bigInteger = new BigInteger("12345678912345678912");
    Fraction f = new Fraction(11,3);
    SummatorNumbers sm = new SummatorNumbers();
    Double res = sm.sumNumbers(7,f,3.21, bigInteger);
    System.out.println(res);
    }

}


