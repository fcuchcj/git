package ch02;

import java.util.HashSet;
import java.util.Set;

public class SetUse {
	public static void main(String[] args) {
	

		        // 집합 A와 B 정의
		        Set<Integer> setA = new HashSet<>();
		        Set<Integer> setB = new HashSet<>();
		        
		        // A에 원소 추가
		        setA.add(1);
		        setA.add(2);
		        setA.add(3);
		        setA.add(4);
		        
		        // B에 원소 추가
		        setB.add(3);
		        setB.add(4);
		        setB.add(5);
		        setB.add(6);

		        // 출력
		        System.out.println("Set A: " + setA);
		        System.out.println("Set B: " + setB);
		        
		        Set<Integer> intersection = new HashSet<>(setA); // A 복사
		        intersection.retainAll(setB); // A ∩ B
		        System.out.println("교집합 (A ∩ B): " + intersection);
	}
}
