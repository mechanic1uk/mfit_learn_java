import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
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


    public void addPath(City destination, int cost) {
        paths.put(destination, cost);
    }

    public String getName() {
        return name;
    }

    public Map<City, Integer> getPaths() {
        return paths;
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
}

/* @todo

1.3.3
Города. Создайте сущность Город, которая будет представлять собой точку на карте со следующими характеристиками:
•	Название города
•	Набор путей к следующим городам, где путь представляет собой сочетание Города и стоимости поездки в него.
Кроме того, Город может возвращать текстовое представление, в виде названия города и списка связанных с ним городов (в виде пары: “название: стоимость”).

1.4.8
Создаем Города. Измените сущность Город из задачи 1.3.3. Новые требования включают:
•	Город можно создать указав только название
•	Город можно создать указав название и набор связанных с ним городов и стоимостей путей к ним

1.6.10
Дороги. Измените сущности из задачи 1.3.3. Гарантируйте, что между двумя городами может быть только одна прямая дорога
(другой путь может быть проложен только транзитом через другие города).
Города можно создавать с указанием заранее заданных путей,
в любой момент времени можно добавить новую дорогу в любой город и удалить имеющуюся дорогу.


 */
