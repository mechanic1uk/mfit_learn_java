package ru.chukhontsev.geometric;

public class Methods {
    public static <T extends Point> void move (Line<T> line){
        line.getStartPoint().setX(line.getStartPoint().getX()+10);
    }
}
