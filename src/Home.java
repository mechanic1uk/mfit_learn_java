public class Home {

    private String name;

    private int floorNumber;

    Home (int floorNumber){
        this.floorNumber = floorNumber;
    }
    Home(String name){
        this.name = name;
    }

    Home (String name, int floorNumber){
        this (name);
        this.floorNumber = floorNumber;
    }
    @Override
    public String toString (){
        if (name == null) {
            return Integer.toString(floorNumber);
        } else return name + " " + floorNumber;
    }
}
