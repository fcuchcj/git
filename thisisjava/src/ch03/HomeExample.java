package ch03;

public class HomeExample {
	public static void main(String[] args) {
		Home home = new Home();
		
		home.user1();
		
		home.User2();
		//매개변수 값은 호출할 때 준다!
		home.use3(new RemoteControl() {
			
			public void turnOn() {
				
			}
			
			public void turnOff() {
				
			}
		});
	}
}
