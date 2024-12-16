package ch02;

public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1);
		//해시코드가 출력됨!
		//.println() 메서드는 자바언어 만든 개발자가 만듬!
		//println() 중에서도 Object를 받는 println();
		//부모,조상의 변수로 후손인스턴트를 참조할 수 있다!
		/*Car c1 = new Bus(); Car은 Bus의 부모변수!
		 * 근데 부모,자식 관계가 없으면 기본적으로 모든 클래스는 
		 * Object를 상속받는다!
		 * Object  o1 = new Car();
		 * Object  o2 = new Bus();
		 */
	}

}
