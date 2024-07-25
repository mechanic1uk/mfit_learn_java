package geometric;

import java.util.List;

public class ClosedPolyline extends Polyline{
    public ClosedPolyline() {
    }

    public ClosedPolyline(Point... points) {
        super(points);
        if (!super.getFirstPoint().equals(super.getLastPoint())){
            super.addLastPoint(super.getFirstPoint());
        }
    }

    public ClosedPolyline(List<Point> pointList) {
        super(pointList);
    }
    @Override
    public void addLastPoint(Point point) {
        super.removeLastPoint();;
        super.addLastPoint(point);
        super.addLastPoint(super.getFirstPoint());
    }

}
