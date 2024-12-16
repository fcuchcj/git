package ch02;

import java.util.ArrayList;

public class Bo {
	public static void main(String[] args) {
		//제너릭을 사용하지 않으면, 자료구조들은 
		//Object를 저장한다!
		ArrayList list = new ArrayList();
		list.add("kim");
		list.add("Lee");
		list.add("Hong");
		
		String str1 = (String)list.get(0);
		String str2 = (String)list.get(1);
		String str3 = (String)list.get(2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
