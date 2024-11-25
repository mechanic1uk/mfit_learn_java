package ru.chukhontsev.main;

import ru.chukhontsev.generic.Box;
import ru.chukhontsev.geometric.Line;
import ru.chukhontsev.geometric.Methods;
import ru.chukhontsev.geometric.Point;
import ru.chukhontsev.geometric.Point3D;
import ru.chukhontsev.people.Student;


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


        Methods m = new Methods();

        System.out.println(m.maxValue(box1,box2,box3,box4,box5));


    }


}