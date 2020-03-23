package sample.bean;

import javax.persistence.*;

@Entity
@Table(name = "pets")
public class Pets {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pet_id;

    @Column
    private String name;

    @Column
    private String type;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Pets(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Pets(){}

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
