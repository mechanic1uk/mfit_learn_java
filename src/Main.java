
import geometric.*;

public class Main {
    public static void main(String[] args) {


        Square sqr = new Square(new Point(2,2),5);

        System.out.println(sqr.getLenght());
        System.out.println(sqr.getSquarePolyline());
        Triangle trl = new Triangle( new Point(2,2),new Point(4,8),new Point(6,2));

        System.out.println("Площадь квадрата "+sqr.getSquareArea());
        System.out.println("Площадь треугольника "+trl.getArea());
        Circle circle = new Circle(new Point(5,5), 6);
        System.out.println("Площадь круга " + circle.getArea());

        Rectangle rcl = new Rectangle(new Point(5,5),5,12);
        System.out.println("Площадь прямоугольника " + rcl.getArea());


    }

}