import java.util.Arrays;


public class Employees {

    private Name employees = null;
    private String department;
    private Employees boss;

    Employees(String employeesFullName, String department) {
        this.department = department;
        String[] temp = new String[3];
        Arrays.fill(temp, null);
        temp = employeesFullName.split(" ");
        if (temp.length == 1) {
            this.employees = new Name(temp[0], "", "");
        } else if (temp.length == 2) {
            this.employees = new Name(temp[0], temp[1], "");
        } else {
            this.employees = new Name(temp[0], temp[1], temp[1]);
        }
    }

    Employees(String employeesFullName, String department, Employees boss) {
        this(employeesFullName, department);
        if (boss.department != this.department) throw new IllegalArgumentException(boss.employees +
                " не является начальником в котором работает " + this.employees);
        this.boss = boss;
    }

    public void setBoss(Employees boss) {
        if (boss.department != this.department) throw new IllegalArgumentException(boss.employees +
                " не является начальником в котором работает " + this.employees);
        this.boss = boss;

    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Name getEmployees() {
        return employees;
    }

    @Override

    public String toString() {
        StringBuilder str = new StringBuilder();
        if (boss == null) {
            str.append(employees.getFirstName()).append(" ")
                    .append(employees.getPatronymic())
                    .append(" ")
                    .append(employees.getLastName())
                    .append(" Начальник отдела ")
                    .append(department);
        } else {
            str.append(employees.getFirstName())
                    .append(" ")
                    .append(employees.getPatronymic())
                    .append(" ")
                    .append(employees.getLastName())
                    .append(" работает в отделе ")
                    .append(department)
                    .append(", начальник которого ")
                    .append(boss.getEmployees().toString());

        }
        return str.toString();

    }
}



