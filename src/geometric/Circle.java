package geometric;

import static java.lang.Math.pow;

public class Circle extends Figure{
    public Circle() {
    }


    public Circle(Point point, int Radius) {
        super(point, Radius);
    }
    public int getArea(){
        return (int) ((2 *Math.PI)*pow(super.sides.getFirst(),2));
    }
}
