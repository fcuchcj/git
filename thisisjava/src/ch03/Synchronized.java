package ch03;

public class Synchronized {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		userThread1 tr = new userThread1();
		tr.setCalculator(calculator);
		//run이라고 하는 메서드를 실행!
		tr.start();
		
		userThread2 tr2 = new userThread2();
		tr2.setCalculator(calculator);
		//run이라고 하는 메서드를 실행!
		tr2.start();
	}
}
