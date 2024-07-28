package ru.chukhontsev.geometric;

import java.util.List;

public class ClosedPolyline extends Polyline {
    public ClosedPolyline() {
    }

    public ClosedPolyline(Point... points) {
        super(points);
    }

    public ClosedPolyline(List<Point> pointList) {
        super(pointList);
    }


    @Override
    public double lenght() {
        double distance = super.lenght();
        if (super.getSize() < 3) return distance;

        return distance + Math.sqrt(Math.pow(super.getFirstPoint().getX() - super.getLastPoint().getX(), 2)
                + Math.pow(super.getFirstPoint().getY()- super.getLastPoint().getY(), 2));



    }
}