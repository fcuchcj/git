package ch02;

public class Can {
	//매개변수로 인터페이스 변수를 받음!
	//그러면 매개변수로 인터페이스를 받았기 때문에 implements로 Can을 받을 수 있음!
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
