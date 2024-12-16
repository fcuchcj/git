package ch02;

import java.util.List;
import java.util.Vector;

public class Bear {
public static void main(String[] args) {
	//Vector컬렉션 생성
	List<Board>list = new Vector<>();
	//작업스레드 객체 생성
	Thread threadA = new Thread() {
		//쓰레드 클래스에는 반드시 run() 실행 메서드가 있어야 한다!
		public void run() {
			//객체 1000개 추가
			for(int i=1;i<=1000;i++) {
				list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
};
//작업 스레드 객체 생성
Thread threadB = new Thread() {
	public void run() {
		//객체 1000개 추가
		for(int i=1001;i<=2000;i++) {
			list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
			}
	}
};

//작업 스레드 실행!
threadA.start();
threadB.start();

//작업 스레드들이 모두 종료될 떄까지 메인 스레드를 기다리게함!
try {
	threadA.join();
	threadB.join();
} catch(Exception e) {
}
//지정된 총 객체 수 얻기
int size = list.size();
System.out.println("총 객체 수:"+size);
System.out.println();
}
}