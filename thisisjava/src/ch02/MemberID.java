package ch02;

public class MemberID {
	private String id;
	private String Pwd;
	private String name;
	private String email;
	//여기 있는 매개변수는 밖에 있는 id임!
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
