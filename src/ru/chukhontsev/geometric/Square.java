package ru.chukhontsev.geometric;

public class Square extends Rectangle implements Calculatable{


    public Square(Point leftPoint, int lenght) {
        super(leftPoint, lenght);

    }

    public Point getLeftPoint() {
        return new Point(super.getPoints().getFirst().getX(),super.getPoints().getFirst().getY());
    }

    public void setLeftPoint(Point leftPoint) {
        super.getPoints().add(new Point(leftPoint.getX(), leftPoint.getY())) ;
    }


    public Polyline getSquarePolyline(){


        return new Polyline(new Point(getLeftPoint().getX(), getLeftPoint().getY()),
                new Point(getLeftPoint().getX() - super.getSides().getFirst(), getLeftPoint().getY()),
                new Point(getLeftPoint().getX() + super.getSides().getFirst(), getLeftPoint().getY() - super.getSides().getFirst()),
                new Point(getLeftPoint().getX() - super.getSides().getFirst(), getLeftPoint().getY() - super.getSides().getFirst()),
                new Point(getLeftPoint().getX(), getLeftPoint().getY())
                );

    }
    public double calculateArea (){
        return  Math.pow(super.getSides().getFirst(),2);
    }
    public int lenght(){
        return (int)calculateArea()/4;
    }
}
