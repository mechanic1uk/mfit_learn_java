package ru.chukhontsev.main;

import ru.chukhontsev.generic.Box;
import ru.chukhontsev.geometric.Methods;
import ru.chukhontsev.geometric.Point;
import ru.chukhontsev.geometric.Point3D;


public class Main {
    public static void main(String[] args) {

        Box <Double>box1 = new Box<>();

        Box <Integer>box2 = new Box<>();
        Box <Long>box3 = new Box<>();
        Box <Short>box4 = new Box<>();
        Box <Float>box5 = new Box<>();
        box1.put(10.0);
        box2.put(120);
        box3.put(127L);
        box4.put((short) -555);
        box5.put(25F);
        Box <Point3D> box6 = new Box<>();

        Methods m = new Methods();
        m.setPoint3DBox(box6);


        System.out.println(m.maxValue(box1,box2,box3,box4,box5));
        System.out.println(box6.get());



    }


}