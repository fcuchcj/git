package ch03;

public class Home {
	//필드에 익명구현 객체 대입!
	RemoteControl rc = new RemoteControl() {
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};


public void user1() {
	rc.turnOn();
	rc.turnOff();
}
//메소드(로컬변수 이용!)
public void User2() {
	RemoteControl rc = new RemoteControl() {
		public void turnOn() {
			System.out.println("에어컨을 켭니다.");
		}
		public void turnOff() {
			System.out.println("에어컨을 끕니다.");
		}
	};
	rc.turnOn();
	rc.turnOff();
}
//매개변수에 생성자 객체를 넣기!
public void use3(RemoteControl rc) {
	rc.turnOn();
	rc.turnOff();
	}

}