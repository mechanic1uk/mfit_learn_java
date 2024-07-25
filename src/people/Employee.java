package people;

import people.Department;

public class Employee {

    private Name name;
    private Department department;


    Employee(String name) {
        this.name = new Name(name);
    }
    Employee(String name, Department department) {
        this(name);
        this.department = department;
        this.department.addEmployee(this);
    }

    public String getName() {
        return name.toString();
    }

    public void setlastName(String name) {
        this.name.setLastName(name);
    }

    public void setDepartment(Department department) {
     if (department == this.department) return;
     if(department != null && this.department.getBoss() == this ) {
         this.department.setBoss(null);
         this.department.removeEmployee(this);
     }
     this.department = department;
     this.department.addEmployee(this);
    }

    public Department getDepartment() {
        return department;
    }

    @Override

    public String toString() {

        if (department.getBoss() == this) {
            return name +" является начальником отдела " + department.getNameDepartment();
        }
        else {
            return name + " является сотрудником департамента "+ department.getNameDepartment() + "  "+ department.toString();
        }

    }
}




