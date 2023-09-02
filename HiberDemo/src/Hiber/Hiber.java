package Hiber;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hiber {
	@Id
	@GeneratedValue
	private int Wid;
	private String Wname;
	private int sal;
	public int getWid() {
		return Wid;
	}
	public void setWid(int wid) {
		Wid = wid;
	}
	public String getWname() {
		return Wname;
	}
	public void setWname(String wname) {
		Wname = wname;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	

}
