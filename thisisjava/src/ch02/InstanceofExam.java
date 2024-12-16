package ch02;

public class InstanceofExam {
public static void main(String[] args) {
	
	Taxi taxi = new Taxi();
	Bus bus = new Bus();
	
	ride(taxi);
	//빈 출력문은 줄 한 줄 띄어쓰기 가능!
	System.out.println();
	ride(bus);
	}

	public static void ride(Vehicle vehicle) {
		//이렇게 쓰려면 Vehicle 인터페이스를 taxi,bus 클래스가 받아야 한다!
		/*if(vehicle instanceof Bus){
		 * vehicle이 Bus로 강제 형변환 가능한 지 묻는 것: instanceof
		 * Bus bus = (Bus)vehicle;
		 * bus.checkFare();
		 * 이러면 vehicle 인터페이스에는 없고, bus에만 있는 인터페이스를 실행 가능!
		 * }
		 */
		//방법2
		//자바 12 이후 부터 가능!
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
