package ch03;

public class Calculator {
	private int memory;

	public int getMemory() {
		//private 변수를 public으로 바꿈!
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
			//2초간 쉬고, catch의 sysout 출력문을 출력!
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
		//이것은 동기화 메서드 
		
		//2. 이것은 동기화 블록 메서드에 synchronized를 붙이지 않음!
		public void setMemory2() {
			synchronized (this) {
				this.memory = memory;
				try {
					Thread.sleep(2000);
					//2초간 쉬고, catch의 sysout 출력문을 출력!
				}catch(InterruptedException e) {}
				System.out.println(Thread.currentThread().getName()+":"+this.memory);
			}
		
	}
	
	
}
