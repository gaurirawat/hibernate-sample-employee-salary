package sample.bean;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int project_id;

    @Column
    String dept;

    @Column
    String guide;

//    ArrayList<Employee> members;

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

//    public ArrayList<Employee> getMembers() {
//        return members;
//    }
//
//    public void setMembers(ArrayList<Employee> members) {
//        this.members = members;
//    }
}
