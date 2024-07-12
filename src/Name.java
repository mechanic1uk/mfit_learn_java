public class Name {
    private String firstName = null; // Имя
    private String lastName = null; // Фамилия
    private String patronymic =null; // Отчество
    Name(String firstName, String lastName, String patronymic){
        this.firstName = firstName;
        this.lastName = lastName;
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
