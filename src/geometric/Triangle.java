package geometric;

import java.util.List;

public class Triangle extends Figure{
    public Triangle() {
    }

    public Triangle(Point... point) {
        super(point);
    }
    public List<Integer> getLenght (){
        if(super.points.size() == 3 ) {
            super.sides.add((int)super.getLenghtLine(super.points.get(0),super.points.get(1)));
            super.sides.add((int)super.getLenghtLine(super.points.get(1),super.points.get(2)));
            super.sides.add((int)super.getLenghtLine(super.points.get(2),super.points.get(0)));
        }
        return super.sides;
    }
    public int getArea() {
        getLenght();
        if(super.sides.size() != 3) throw new IllegalArgumentException("Figure is not Triangle");
        return (super.sides.get(0) + super.sides.get(1) + super.sides.get(2))/2;
    }



}
