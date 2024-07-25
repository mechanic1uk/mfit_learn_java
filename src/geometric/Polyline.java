package geometric;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private List<Point> points  = new ArrayList<>();

    public Polyline(){

    }

    public Polyline(Point... points){
        addPoint(points);
    }
    public Polyline(List<Point> pointList){
        for (Point x :pointList){
            addPoint(x);
        }

    }

    public void addPoint(Point... points){
        for (Point x: points){
            this.points.add(x);

        }
    }
    public void removePoint(Point point) {
        this.points.remove(point);
    }

    public int getSize() {
        return points.size();
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    public void addFirstPoint(Point point) {
        this.points.addFirst(point);
    }

    public void setPointCoordinates(int index, int x, int y) {
        this.points.get(index).setXY(x, y);
    }

    public Point getFirstPoint() {
        return points.getFirst();
    }
    public Point getLastPoint() {
        return points.getLast();
    }

    public double lenght(){
        if (points.size() <= 1 ) return 0;
        double distance =0;
        for (int i =0; i < points.size()-1; i++){
            distance += Math.sqrt(Math.pow(points.get(i+1).getX() - points.get(i).getX(), 2) + Math.pow(points.get(i+1).getY()-points.get(i).getY(), 2));
        }
        return distance;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();

    }
}
