package Hiber;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainG {
	public static void main(String[] args) {
		
		SessionFactory sfactory=new Configuration().configure("gameconfig.cfg.xml").buildSessionFactory();//Session factory
		Session ses=sfactory.openSession();// Session creation
		Transaction tx=null;
		tx=ses.beginTransaction();//start transaction
		Game gm=new Game();//init object for jpa class
		
		ses.persist(gm);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter game name");
		String Gname=sc.nextLine();

		System.out.println("enter team members");
		int TeamMember=sc.nextInt();
		
		System.out.println("enter captain name");
		String Cname=sc.nextLine();
		
		System.out.println("enter the total win game");
		int Gwin=sc.nextInt();
		
		gm.setGname(Gname);
		gm.setTeamMember(TeamMember);
		gm.setCName(Cname);
		gm.setGwin(Gwin);
		String st;
			 System.out.println(gm.getGid()+"   "+  gm.getGname()+"    "+    gm.getCName()+"    "+     gm.getTeamMember()+"   "+     gm.getGwin());// display the value	 
		ses.flush();
		tx.commit();
		ses.close();

	}

}
