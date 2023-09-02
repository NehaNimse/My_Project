package Hiber;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Game {
	@Id
	@GeneratedValue
	private int Gid;
	private String Gname;
	private int TeamMember;
	private String CName;
	private int Gwin;
	public int getGid() {
		return Gid;
	}
	public void setGid(int gid) {
		Gid = gid;
	}
	public String getGname() {
		return Gname;
	}
	public void setGname(String gname) {
		Gname = gname;
	}
	public int getTeamMember() {
		return TeamMember;
	}
	public void setTeamMember(int teamMember) {
		TeamMember = teamMember;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public int getGwin() {
		return Gwin;
	}
	public void setGwin(int gwin) {
		Gwin = gwin;
	}

}
