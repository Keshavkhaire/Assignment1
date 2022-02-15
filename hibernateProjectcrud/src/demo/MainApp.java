package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();
		Session  session =  sessionFactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		
		Subject subject= new Subject();
		subject.setSubid(3554);
		subject.setSubjectname("keshav");
	

	}

}
