package people;

public class Name {
    private String firstName = null; // Имя
    private String lastName = null; // Фамилия
    private String patronymic =null; // Отчество
    public Name (String lastName){
        this.lastName = lastName;
    }
    public Name(String firstName, String lastName, String patronymic){
        this(lastName);
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setFullName(String name) {
        String [] splitname = name.split(" ");
        if (splitname.length == 3) {
            this.firstName = splitname[0];
            this.lastName = splitname[1];
            this.patronymic = splitname[2];
        } else if (splitname.length == 2) {

        }
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    @Override

    public String toString(){
        StringBuilder fullName = new StringBuilder();
        if (firstName  != null && !firstName.isEmpty()) fullName.append(firstName + " ");
        if (lastName  != null && !lastName.isEmpty()) {
            fullName.append(lastName);
            if (patronymic != null && !patronymic.isEmpty()){
                fullName.append(" ").append(patronymic);
            }
        } else if (patronymic != null && !patronymic.isEmpty()) fullName.append(patronymic + " ");

        return fullName.toString().trim();
    }
}
