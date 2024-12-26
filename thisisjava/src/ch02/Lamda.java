package ch02;

public class Lamda {
	public static void main(String[] args) {
		Py v = new Py();
		v.action(()->{
			System.out.println("I am here");
		});
	}
}
