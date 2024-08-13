package ru.chukhontsev.main;

import ru.chukhontsev.geodesic.City;
import ru.chukhontsev.geometric.Line;
import ru.chukhontsev.geometric.Point;
import ru.chukhontsev.geometric.Polyline;
import ru.chukhontsev.mathematics.Fraction;
import ru.chukhontsev.mathematics.SummatorNumbers;
import ru.chukhontsev.people.Department;
import ru.chukhontsev.people.Employee;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


            City city1 = new City("Moskow");
            City city2 = new City("St.Pitersburg");
            City city3 = new City("Ekaterinburg");
            City city4 = new City("Ekaterinburg");

            HashMap<City,Integer> ways = new HashMap<>();
            HashMap<City,Integer> ways2 = new HashMap<>();

            ways.put(city2,1);
            ways.put(city3,1);
            ways.put(city4,1);
            ways2.put(city1,1);
            ways2.put(city2,1);
            ways2.put(city4,1);

            city1.addPath(city2,1);
            city1.addPath(city3,1);
            city1.addPath(city4,1);
            City city5 = new City("Ekaterinburg", ways);
            City city6 = new City("Ekaterinburg", ways2);

            System.out.println(city1.equals(city5));
            System.out.println(city1.equals(city6));











        }


}
