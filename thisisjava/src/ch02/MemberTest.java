package ch02;

public class MemberTest {
	public static void main(String[] args) {
		
		
		MemberDTO mDto = new MemberDTO();
		mDto.setId("java"); //String id = "java";
		mDto.setPwd("java");
		mDto.setName("java");
		mDto.setEmail("java@co.kr");
		
		String id = mDto.getId();//.getId()의 타입이 String
		String pwd = mDto.getPwd();
		String name = mDto.getName();
		String email = mDto.getEmail();
		
		System.out.println("id="+id);
		System.out.println("pwd="+pwd);
		System.out.println("name="+name);
		if(email!=null) {
			System.out.println(email);
		}
		System.out.println("setEmail="+email);
		System.out.println(mDto.toString()); //반면에 String 타입은 출력문 괄호 안에 쓸 수 있다!
		mDto.display();
		//모든 클래스는 object로부터 자동으로 상속받는다!
	}
}
