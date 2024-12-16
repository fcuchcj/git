package ch02;

public class Board {
	private String subject;
	private String content;
	private String writer;
	//private로 형성된 데이터지만 같은 클래스 안에 있기 때문에, 
	//매개변수로 받을 수 있다!
	public Board(String subject,String content,String writer) {
		//외부로부터 subject,content,writer를 받음!
		//받은 매개변수로 객체 생성!
		this.subject=subject;
		this.content=content;
		this.writer=writer;
	}
	//생성된 객체로 getter, setter 생성하기!
	//메서드 안에 매개변수로 가져온 객체 안의 데이터들을 받은 후 다시 재정의 하기!
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
