package ch03;

public class userThread1 extends Thread {
	private Calculator cal;
	
	public userThread1 () {
		//스레드 이름 변경!, 스레드 클레스를 상속받은 userThread 클래스!
		setName("User1Thread");
	}
	//private 필드를 메서드 매개변수에 대입!, 타입을 같이 입력!
	public void setCalculator(Calculator calculator) {
		this.cal = calculator;
	}
	@Override
	public void run() {
		cal.setMemory(80);
	}
	

	
	
}
