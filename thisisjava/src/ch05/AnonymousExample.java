package ch05;

public class AnonymousExample {

	public static void main(String[] args) {
		//먼저 Anonymous 객체를 만들어 주기!
		Anonymous ar = new Anonymous();
		//필드값 호출!
		ar.localVar.turnOn();
		ar.localVar.turnOff();
		//메소드 값 호출!
		ar.method1();
		
		ar.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("smartTV를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("smartTV를 끕니다.");
			}
		});
	}

}
