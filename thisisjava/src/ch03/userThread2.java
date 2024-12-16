package ch03;

public class userThread2 extends Thread {
	private Calculator calculator;
	
	public userThread2 () {
		setName("User2Thread");
	}
	//private 필드를 메서드 매개변수에 대입!, 타입을 같이 입력!
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
	
	
}
