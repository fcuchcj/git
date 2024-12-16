package ch02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Oneal {
	public static void main(String[] args) {
		//ArrayList컬렉션 객체 생성
		List<String>list1 = new ArrayList<String>();
		//LinkedList컬렉션 객체 생성
		List<String>list2 =  new LinkedList<String>();
		//시작과 끝시간을 저장할 변수 생성
		long startTime;
		long endTime;
		//ArrayList컬렉션에 저장할 시간 측정
		startTime =  System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n","ArrayList 걸린 시간:",(endTime-startTime));
		/*-17s는 출력문자열 갯수 제한, 8d는 (endTime-startTime)값 우측 정렬(10진수)
		 */
		//LinkedList 컬렉션에 저장하는 시간 측정
		startTime =  System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n","LinkedList 걸린 시간:",(endTime-startTime));
	}
}
