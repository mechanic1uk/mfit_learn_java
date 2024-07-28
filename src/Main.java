
import geometric.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Square sqr = new Square(new Point(2,2),5);

        System.out.println(sqr.getLenght());
        System.out.println(sqr.getSquarePolyline());
        Triangle trl = new Triangle( new Point(2,2),new Point(4,8),new Point(6,2));

        System.out.println("Площадь квадрата "+sqr.calculateArea());
        System.out.println("Площадь треугольника "+trl.calculateArea());
        Circle circle = new Circle(new Point(5,5), 6);
        System.out.println("Площадь круга " + circle.calculateArea());

        Rectangle rcl = new Rectangle(new Point(5,5),5,12);
        System.out.println("Площадь прямоугольника " + rcl.calculateArea());

        List<Figure> figures = new ArrayList<>();
        figures.add(trl);
        figures.add(circle);
        figures.add(rcl);
        figures.add(sqr);

        System.out.println("Общая площадь фигур составляет: " + calculateTotalArea(figures));
    }

    public static double calculateTotalArea(List<Figure> figures) {
        double totalArea = 0.0;

        for (Figure figure : figures) {
            totalArea += figure.calculateArea();
        }

        return totalArea;
    }


}


