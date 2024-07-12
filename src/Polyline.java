import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private List<Point> points;

    public Polyline() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        this.points.add(point);
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

    public void setPoints(Point points) {
        this.points.addFirst(points);
    }

    public void setPointCoordinates(int index, int x, int y) {
        this.points.get(index).setXY(x, y);
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