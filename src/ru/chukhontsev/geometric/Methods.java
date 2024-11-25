package ru.chukhontsev.geometric;

import ru.chukhontsev.generic.Box;

public class Methods {
    public static <T extends Point> void move (Line<T> line){
        line.getStartPoint().setX(line.getStartPoint().getX()+10);
    }
    public static double maxValue (Box<? extends Number>...boxes){
        Double maxVal=0.0;

        for (Box box: boxes) {
            if (box.isEmpty()) throw new IllegalArgumentException("Коробка не должна быть пустой");
            Number boxval = (Number) box.get();
            if(boxval.doubleValue() > maxVal) maxVal = boxval.doubleValue();
            }

         return  maxVal;
    }
}
