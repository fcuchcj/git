package ch05;

public class Elementary extends Student {
	//선언안 해도 부모에 가지고 있는 필드를 쓸 수 있다.
	public Elementary(String _name,int _grade) {
		System.out.println("Elementary 생성자 메소드 호출...");
		name=_name;
		grade=_grade;
	}
}
