package ch05;

public class Anonymous {
	//필드 선언 할 때 인터페이스타입 사용 가능
	RemoteControl localVar = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	//메서드 안에 인터페이스 타입의 변수 쓰기!
	void method1() {
		RemoteControl localvar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}		
	};
	localvar.turnOn();
	localvar.turnOff();
}
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
