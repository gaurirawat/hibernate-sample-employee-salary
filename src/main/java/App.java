
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import sample.bean.Cabin;
import sample.bean.Employee;
import sample.bean.Pets;
import sample.utils.DBOperations;
import sample.utils.SessionUtil;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String...args){
        DBOperations dbOperations = new DBOperations();
        dbOperations.openCurrentSession();

//        Cabin c = new Cabin();
//        c.setFloorNo(4);
//        c.setRoomNo("400");

        Pets p1 = new Pets("muffin", "dog");
        Pets p2= new Pets("furball", "cat");

        Employee e= new Employee();
        e.setFirstName("a");
        e.setLastName("A");
//        e.setCabin(c);

        List<Pets> petlist = new ArrayList<Pets>();
        petlist.add(p1);
        petlist.add(p2);
        e.setPetslist(petlist);
        p1.setEmployee(e);
        p2.setEmployee(e);

//        System.out.println(dbOperations.insert(c));
        System.out.println(dbOperations.insert(e));
        System.out.println(dbOperations.insert(p1));
        System.out.println(dbOperations.insert(p2));
//        System.out.println(dbOperations.getCurrentSession().get(Employee.class,11).
//                getCabin().getFloorNo());
//        System.out.println(dbOperations.getCurrentSession().get(Cabin.class,12).
//                getEmployee().getFirstName());
        System.out.println(dbOperations.getCurrentSession().get(Pets.class,46).
                getEmployee().getFirstName());
        petlist =dbOperations.getCurrentSession().get(Employee.class, 26).getPetslist();
        System.out.println(petlist.get(0).getName());
    }
}
