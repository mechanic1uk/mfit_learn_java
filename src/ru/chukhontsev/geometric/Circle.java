package ru.chukhontsev.geometric;

import static java.lang.Math.pow;

public class Circle extends Figure implements Calculatable {
    public Circle() {
    }


    public Circle(Point point, int Radius) {
        super(point, Radius);
    }

    public double calculateArea(){
        return  ((2 *Math.PI)*pow(super.getSides().getFirst(),2));
    }
    public int lenght(){
        return (int) (2*Math.PI*super.getSides().getFirst());
    }
}
