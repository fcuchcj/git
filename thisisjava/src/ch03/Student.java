package ch03;

public class Student {
	private String name;
	private int score;
	//학생 객체를 만들어서 필드를 저장시켜 놓기!
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	//setter 추가 시키지 않고, getter만 추가시키!
	//getter만 추가하면 return으로 name,score을 가짐!
	//private로 받아서 해당 변수를 읽을 수 없는데, getter를 이용해서 읽을 수 있다!
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	
}
