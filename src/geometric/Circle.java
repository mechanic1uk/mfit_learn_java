package geometric;

import static java.lang.Math.pow;

public class Circle extends Figure implements Calculatable {
    public Circle() {
    }


    public Circle(Point point, int Radius) {
        super(point, Radius);
    }
    @Override
    public double calculateArea(){
        return  ((2 *Math.PI)*pow(super.sides.getFirst(),2));
    }
    public int lenght(){
        return (int) (2*Math.PI*super.sides.getFirst());
    }
}
