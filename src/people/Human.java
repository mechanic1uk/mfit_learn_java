package people;

public class Human {
    private Name name;
    private int hight;
    private Name father;

    Human(Name name){
        this.name = name;
    }
    Human(Name name, Name father){
        this(name);
        this.father = father;

    }
    Human(Name name, int hight){
        this(name);
        this.hight = hight;
    }

    public Name getName(){
        return this.name;
    }
    public int getHight(){
        return this.hight;
    }

    @Override

    public String toString () {
        StringBuilder fullName = new StringBuilder();
        if (name.getFirstName() != null && !name.getFirstName().isEmpty()) fullName.append(name.getFirstName() + " ");
        if (name.getPatronymic() != null && !name.getPatronymic().isEmpty()) {
            fullName.append(" ").append(name.getPatronymic());
        } else if (father != null && father.getFirstName() != null && !father.getFirstName().isEmpty()) {
            fullName.append(" ").append(father.getFirstName()).append("ович");
        }

        if (name.getLastName() != null && !name.getLastName().isEmpty() ){
            fullName.append(" ").append(name.getLastName());
        } else  if (father != null && !father.getLastName().isEmpty()) fullName.append(" ").append(father.getLastName());

        return fullName.toString().trim();
    }
}
