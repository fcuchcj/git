package ch04;

public class Lamda {
	public static void main(String[] args) {
		action((x,y)->{
			int result = x+y;
			System.out.println(result);
		});
		
		action((x,y)->{
			int result = x-y;
			System.out.println(result);
		});
	}
		//나중에 람다식으로 호출하기 위해 일부러 static을 씀!
		public static void action(Calculable calculable) {
			//데이터
			int x = 10;
			int y = 4;
			
			calculable.calculator(x,y);
		
	}
}
