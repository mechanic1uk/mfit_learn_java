package ru.chukhontsev.people;

public class Employee {

    private Name name;
    private Department department;


    public Employee(String name) {
        this.name = new Name(name);
    }
    Employee(String name, Department department) {
        this(name);
        this.setDepartment(department);

    }

    public String getName() {
        return name.toString();
    }

    public void setlastName(String name) {
        this.name.setLastName(name);
    }

    public void setDepartment(Department department) {
        if (this.department == department) return;
        if (this.department == null) this.department = department;
        if (this == this.department.boss && this.department != null) this.department.boss = null;
        if (this.department != null) this.department.employees.remove(this);
        if (department != null) this.department.addEmployee(this);

    }

    public Department getDepartment() {
        return department;
    }

    @Override

    public String toString() {
        if (department == null) return "У сотрудника нет департамента";
        if (department.boss == this) {
            return name +" является начальником отдела " + department.getNameDepartment();
        }
        else {
            return name + " является сотрудником департамента "+ department.nameDepartment + "  "+ department.toString();
        }

    }
}




