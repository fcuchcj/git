package ch04;

public class LamdaExample {
	public static void main(String[] args) {
		Person py = new Person();
		//매개변수가 1개일 때는 1개의 변수만 표시해서,
		//a->{sysout ..} 이런 식으로 표시하기!
		py.person(word->{
			System.out.println(word);
		});
	}
}
