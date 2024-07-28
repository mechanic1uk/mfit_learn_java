package geometric;

public class Rectangle extends Figure {

    public Rectangle() {
    }


    public Rectangle(Point point, Integer... side) {
        super(point, side);
    }
@Override
    public double calculateArea(){
        if (super.sides.size() !=2) throw new IllegalArgumentException("This figure isn't rectangle");
        return super.sides.get(0) * super.sides.get(1);
    }
}
