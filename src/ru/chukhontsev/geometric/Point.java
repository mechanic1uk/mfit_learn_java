package ru.chukhontsev.geometric;

public class Point extends Object implements Cloneable{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return this.getClass().getName()+"  {" + x + ";" + y + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return this.x == point.x && this.y == point.y;
    }

    @Override
    public Point clone()  {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    public double length (Point targetPoint){
        return Math.sqrt(Math.pow(this.getX() - targetPoint.getX(), 2) + Math.pow(this.getY()-targetPoint.getY(), 2));
    }
}