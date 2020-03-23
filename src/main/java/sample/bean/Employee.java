package sample.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "emp")
public class Employee<list> {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;

    @Column
    private String LastName;

    @OneToOne(targetEntity = Cabin.class, cascade = CascadeType.ALL)
    @JoinColumn(name= "cabin_id")
    private Cabin cabin;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "employee")

    private List<Pets> petslist;

    public List<Pets> getPetslist() {
        return petslist;
    }

    public void setPetslist(List<Pets> petslist) {
        this.petslist = petslist;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }


//    @ManyToMany(targetEntity=Project.class, cascade={CascadeType.ALL})
//    private List<Project>project;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
