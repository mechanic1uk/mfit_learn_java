package ru.chukhontsev.people;

import java.util.ArrayList;
import java.util.List;

public class Department {
    Employee boss;
    String nameDepartment;
    List<Employee> employees = new ArrayList<>();

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
        return new ArrayList<>(employees);
    }

    public void setBoss(Employee boss) {
        if (boss != null) boss.setDepartment(this);
        this.boss = boss;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) return;
        this.employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employee.setDepartment(this);
    }

    @Override
    public String toString() {
        if (boss == null) return "У департамента " + nameDepartment+" нет начальника";
        return " " + boss;

    }
}
