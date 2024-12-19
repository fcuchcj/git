
package ch04;

public class MemberDTO {
	private String id;
	private String pwd;
	private String name;
	private String email;

	//여기 있는 매개변수는 밖에 있는 id임!
	public MemberDTO() {
			this(null,null,null,null);
			System.out.println("생성자 메소드...");
			System.out.println("id="+id);
			System.out.println("pwd="+pwd);
			System.out.println("name="+name);
			System.out.println("setemail="+email);
		}
	
	public MemberDTO(String id,String pwd) {
		this(id,pwd,null,null);
	}
	
	public MemberDTO(String id, String pwd, String name, String email) {
	   setId(id);
	   setId(pwd);
	   setId(name);
	   setId(email);
	   //정확히는 set을 호출하는 메서드
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	
	private void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String getPwd() {
		return pwd;
	}
	private void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	private void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return "id="+id+",pwd="+pwd+",name="+name+",email"+email;
	}
	
	public void display() {
		System.out.println("id="+id);
		System.out.println("pwd="+pwd);
		System.out.println("name="+name);
		if(email!=null)
			System.out.println("email="+email);
	
	}
}
