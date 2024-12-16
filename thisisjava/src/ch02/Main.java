package ch02;

public class Main {
	    public static void main(String[] args) {
	        Counter counter = new Counter();

	        Runnable task = () -> {
	            for (int i = 0; i < 1000; i++) {
	                counter.increment();
	            }
	        };

	        Thread thread1 = new Thread(task);
	        Thread thread2 = new Thread(task);

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final count: " + counter.getCount()); // 결과가 예상치 못한 값이 될 수 있음
	    }
	}

