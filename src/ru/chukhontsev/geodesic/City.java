package ru.chukhontsev.geodesic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class City extends Object {
    private String name;
    private Map<City, Integer> paths;
    public City(String name) {
        this.name = name;
        this.paths = new HashMap<>();
    }
    public City(String name, Map<City, Integer> cityList) {
        this(name);
       for( Map.Entry<City, Integer> entry : cityList.entrySet()){
           this.paths.put(entry.getKey(), entry.getValue());
       }
    }


    public String getName() {
        return name;
    }

    public Map<City, Integer> getPaths() {
        return paths;
    }
    // Методы для работы с дорогами
    public void addPath(City destination, int cost) {
        // Проверяем, что между этими городами еще нет дороги
        if (!paths.containsKey(destination)) {
            paths.put(destination, cost);
        } else {
            throw new IllegalArgumentException("Дорога между этими городами уже существует");
        }
    }

    public void removePath(City destination) {
        // Проверяем, что дорога между городами существует
        if (paths.containsKey(destination)) {
            paths.remove(destination);
        } else {
            throw new IllegalArgumentException("Дороги между этими городами не существует");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n");

        for (Map.Entry<City, Integer> entry : paths.entrySet()) {
            sb.append("\t").append(entry.getKey().getName()).append(": ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return Objects.equals(paths, city.paths);
    }


}

