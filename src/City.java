import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Boolean> roads;

    public City(String name) {
        this.name = name;
        this.roads = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addRoad(City destination, boolean direct) {
        roads.put(destination, direct);
        destination.roads.put(this, direct);
    }

    public void removeRoad(City destination) {
        roads.remove(destination);
        destination.roads.remove(this);
    }

    public boolean isDirectRoad(City destination) {
        return roads.getOrDefault(destination, false);
    }

    public boolean isConnected(City destination) {
        return roads.containsKey(destination);
    }
}


