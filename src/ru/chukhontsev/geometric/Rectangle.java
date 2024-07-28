package ru.chukhontsev.geometric;

import java.util.List;

public class Rectangle extends Figure implements Calculatable {

    public Rectangle() {
    }


    public Rectangle(Point point, Integer... side) {
        super(point, side);
    }


    public double calculateArea() {
        if (!isRectangle()) throw new IllegalArgumentException("Это не прямоугольник");

        return super.getSides().get(0) * super.getSides().get(1);

    }
    private boolean isRectangle(){
        if (super.getSides().isEmpty() || super.getSides().size() < 2) {
            return false;
        } else {
        return true;
        }
    }


    public int lenght() {
        if (super.getSides().isEmpty()) throw new IllegalArgumentException("Список сторон пустой ");
        return super.getSides().get(0) * super.getSides().get(1) ;
    }
}
