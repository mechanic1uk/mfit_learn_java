package ru.chukhontsev.geometric;

import java.util.Objects;

public class Line extends Object{

    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint){
        this.startPoint = new Point(startPoint.getX(),startPoint.getY());
        this.endPoint = new Point(endPoint.getX(), endPoint.getY());
    }
    public Line (int startX, int startY, int endX, int endY){
        this.startPoint = new Point(startX, startY);
        this.endPoint = new Point(endX, endY);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = new Point(startPoint.getX(),startPoint.getY());
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = new Point(endPoint.getX(), endPoint.getY());
    }

    public Point getStartPoint() {
        return new Point(this.startPoint.getX(), this.startPoint.getY());
    }

    public Point getEndPoint() {
        return new Point(this.endPoint.getX(), this.endPoint.getY());
    }

    public double lenght (){
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY()-startPoint.getY(), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(startPoint, line.startPoint) && Objects.equals(endPoint, line.endPoint);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString(){
        return "Линия от " + startPoint + " до " + endPoint;
    }
}
