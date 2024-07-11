public class Name {
    private String firstName; // Имя
    private String lastName; // Фамилия
    private String patronymic; // Отчество
    Name(String firstName, String lastName, String patronymic){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
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
