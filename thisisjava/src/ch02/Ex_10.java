package ch02;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;

public class Ex_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+i;
			set.add(num);
		}
		
		List list = new LinkedList(set);
		//Collections.sort(list);
		System.out.println(list);
	}
}
