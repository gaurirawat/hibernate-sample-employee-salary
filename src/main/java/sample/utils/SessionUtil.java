package sample.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sample.bean.*;

public class SessionUtil {
    private static final SessionFactory sessionfactory = (new SessionUtil()).getSessionFactory();

    public SessionFactory getSessionFactory(){
        return new Configuration().addAnnotatedClass(Cabin.class).addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class).addAnnotatedClass(Project.class).addAnnotatedClass(Pets.class).buildSessionFactory();
    }
}
