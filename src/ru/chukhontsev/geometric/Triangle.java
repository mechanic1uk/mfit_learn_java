package ru.chukhontsev.geometric;

import java.util.List;

public class Triangle extends Figure implements Calculatable{
    public Triangle() {
    }

    public Triangle(Point... point) {
        super(point);
        findTriangeSides();
    }
    private void findTriangeSides (){
        if ( super.getPoints().isEmpty()) throw new IllegalArgumentException("Точки фигуры небыли указаны, расчет не возможен");
        if (super.getSides().isEmpty() && super.getPoints().size() ==3 ){
            setSide((int)super.getLenghtLine(getPoints().get(0),getPoints().get(1)));
            setSide((int)super.getLenghtLine(getPoints().get(1),getPoints().get(2)));
            setSide((int)super.getLenghtLine(getPoints().get(2),getPoints().get(0)));
        }
    }


    public double calculateArea() {
        findTriangeSides();
        return (super.getSides().get(0) + super.getSides().get(1) + super.getSides().get(2))/2;
    }


    public int lenght() {
       if (super.getSides().size() < 3) throw new IllegalArgumentException("Фигура не является треугольником ");
        return super.getSides().get(0)+super.getSides().get(1)+super.getSides().get(2);
    }
}
