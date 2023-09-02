package Hiber;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Learner {
	@Id
	@GeneratedValue
	private int Lid;
	private String Lname;
	private int age;
	private String course;
	private int Lmarks;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		course = course;
	}
	public int getLmarks() {
		return Lmarks;
	}
	public void setLmarks(int lmarks) {
		Lmarks = lmarks;
	}
	

}
