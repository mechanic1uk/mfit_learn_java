package geometric;

import java.util.ArrayList;
import java.util.List;


abstract class Figure {
    List<Point> points = new ArrayList<>();
    List<Integer> sides = new ArrayList<>();

    public Figure() {
    }
    public Figure(Point...point) {
       this.setPoint(point.clone());
    }
    public Figure(Point point, Integer...side ) {
        this.setPoint(new Point(point.getX(),point.getY()));
        this.setSide(side);
    }


    public void setPoint(Point...point) {
        for (Point p: point.clone()) {
            this.points.add(p);
        }
    }

    public void setSide(Integer...side) {
        for(int i: side.clone()) {
            this.sides.add(i);
        }
    }
    public double getLenghtLine(Point firstPoint, Point secondPoint){
       return  Math.sqrt(Math.pow(secondPoint.getX() - firstPoint.getX(), 2)
                + Math.pow(secondPoint.getY()-firstPoint.getY(), 2));
    }

    public List<Point> getPoints() {
        return points;
    }

    public List<Integer> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Точки координат: ");
        for (Point p: points){
            result.append(p.toString());
            result.append(", ");
        }
        result.append("Длинна: ");
        for (int i: sides){
            result.append(i);
            result.append(", ");

        }

        return result.toString();
    }
}
