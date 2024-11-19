package ru.chukhontsev.geometric;

import java.util.Objects;

public class Line <T extends Point> implements Cloneable{


    private T startPoint;
    private T endPoint;


    private Line(T startPoint, T endPoint){
        if (startPoint == null || endPoint == null) throw new IllegalArgumentException("Одна из точек не содержит значения");
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    private static <V extends Point> Line <V> createof(V startPoint, V endPoint){
        return new Line<>(startPoint, endPoint);
    }
    private static  Line <Point> createof(int startX, int startY, int endX, int endY){
        Point sPoint = new Point(startX,startY);
        Point ePoint = new Point(endX,endY);
        return new Line<>(sPoint, ePoint);

    }

    public void setStartPoint(T startPoint) {
        this.startPoint = (T) startPoint.clone();
    }

    public void setEndPoint(T endPoint) {
        this.endPoint =  (T) endPoint.clone();
    }

    public T getStartPoint() {
        return startPoint;
    }

    public T getEndPoint() {
        return endPoint;
    }

    public int lenght(){
        return (int) startPoint.length(endPoint);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(startPoint, line.startPoint) && Objects.equals(endPoint, line.endPoint);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(startPoint,endPoint);
    }

    @Override
    public String toString(){
        return this.getClass().getName() + " Линия от " + startPoint + " до " + endPoint;
    }

    @Override
    public Line<T> clone() {
        try {
            Line res = new Line(((Line) super.clone()).startPoint,((Line) super.clone()).endPoint );

            return res;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
