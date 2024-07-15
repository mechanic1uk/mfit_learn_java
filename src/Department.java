import java.util.ArrayList;
import java.util.List;

public class Department {
    private Employee boss;
    private String nameDepartment;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.nameDepartment = name;


    }

    public Department(String name, Employee boss) {
        this(name);
        this.boss = boss;
    }


    public Employee getBoss() {
        if(this.boss == null) return null;
        return this.boss;
    }


    public String getNameDepartment() {
        return nameDepartment;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setBoss(Employee boss) {
        if (boss != null) boss.setDepartment(this);
        this.boss = boss;

    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public void setEmployees(Employee employee) {
        this.employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        this.employees.remove(employee);
    }

    @Override
    public String toString() {
        return
                " " + boss;

    }
}
