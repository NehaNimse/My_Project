package Hiber;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainC {
	public static void main(String[] args) {
		SessionFactory sfactory=new Configuration().configure("LearnerConfig.cfg.xml").buildSessionFactory();//Session factory
		Session ses=sfactory.openSession();// Session creation
		Transaction tx=null;
		tx=ses.beginTransaction();//start transaction
		Learner learn=new Learner();//init object for jpa class
		
		ses.persist(learn);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter learner name");
		String Lname=sc.nextLine();

		System.out.println("enter age");
		int age=sc.nextInt();
		
		System.out.println("enter course name");
		String course=sc.nextLine();
		
		System.out.println("enter marks");
		int marks=sc.nextInt();
		
		learn.setLname(Lname);
		learn.setAge(age);
		learn.setCourse(course);
		learn.setLmarks(marks);
		String st;
			 System.out.println(learn.getLid()+"   "+  learn.getLname()+"    "+learn.getAge()+"    "+learn.getCourse()+"   "+learn.getLmarks());// display the value	 
		ses.flush();
		tx.commit();
		ses.close();
	}

}
