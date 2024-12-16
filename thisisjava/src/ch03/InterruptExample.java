package ch03;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			try {
				System.out.println("There is sleeping..");
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println("There was interrupted");
			}
		});
		thread.start();
		
		try {
			Thread.sleep(1000);
			thread.interrupt();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
