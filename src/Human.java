public class Human {
    private Name name;
    private int hight;


    Human(Name name, int hight){
        this.name = name;
        this.hight = hight;
    }
    public Name getName(){
        return this.name;
    }
    public int getHight(){
        return this.hight;
    }
}
