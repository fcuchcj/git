
package ch04;

public class MemberDTO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String toString;
	//여기 있는 매개변수는 밖에 있는 id임!
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		pwd = pwd;
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
	
	public String toString() {
		return "id="+id+",name="+name+",email="+email;
	}
	
	public void display() {
		System.out.println("id="+id);
		System.out.println("pwd="+pwd);
		System.out.println("name="+name);
		System.out.println("setemail="+email);
	}	
	
	public MemberDTO(String id, String pwd, String name, String email) {
	   setId(id);
	   setId(pwd);
	   setId(name);
	   setId(email);
	}
	
	MemberDTO mDto3 = new MemberDTO("java2","java2","java2","java2@co.kr"); 
	
	
}
