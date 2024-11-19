package ru.chukhontsev.geometric;

public class Point3D extends Point implements Cloneable {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double length(Point other) {
        if (other instanceof Point3D) {
            Point3D p = (Point3D) other;
            return Math.sqrt(Math.pow(p.getX() - this.getX(), 2) +
                    Math.pow(p.getY() - this.getY(), 2) +
                    Math.pow(p.z - this.z, 2));
        }
        return super.length(other); // Корректировка: используем 2D метод
    }

    @Override
    public Point3D clone() {
        return new Point3D(super.getX(), super.getY(), z); // Предполагаем, что у Point2D есть getX() и getY()
    }
}