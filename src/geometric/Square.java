package geometric;
import java.math.*;

public class Square extends Figure{


    public Square(Point leftPoint, int lenght) {
        super(leftPoint, lenght);

    }

    public Point getLeftPoint() {
        return new Point(super.getPoints().getFirst().getX(),super.getPoints().getFirst().getY());
    }

    public void setLeftPoint(Point leftPoint) {
        super.points.add(new Point(leftPoint.getX(), leftPoint.getY())) ;
    }

    public int getLenght() {
        return super.sides.getFirst();
    }

    public void setLenght(int lenght) {
        super.sides.add(lenght);
    }

    public Polyline getSquarePolyline(){


        return new Polyline(new Point(getLeftPoint().getX(), getLeftPoint().getY()),
                new Point(getLeftPoint().getX() - getLenght(), getLeftPoint().getY()),
                new Point(getLeftPoint().getX() + getLenght(), getLeftPoint().getY() - getLenght()),
                new Point(getLeftPoint().getX() - getLenght(), getLeftPoint().getY() - getLenght()),
                new Point(getLeftPoint().getX(), getLeftPoint().getY())
                );

    }
    public int getSquareArea (){
        return (int) Math.pow(getLenght(),2);
    }
}
