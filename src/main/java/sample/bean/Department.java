package sample.bean;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "dept")
public class Department {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int dept_id;

    @Column
    String name;
//
//    @Column
//    Employee manager;
//
//    @OneToMany
//    @JoinColumn(name="emp_id")
//    ArrayList<Employee> employees;

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Employee getManager() {
//        return manager;
//    }
//
//    public void setManager(Employee manager) {
//        this.manager = manager;
//    }
//
//    public ArrayList<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(ArrayList<Employee> employees) {
//        this.employees = employees;
//    }
}
