package ch02;

import java.util.ArrayList;

public class Do {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("kim");
		list.add("Lee");
		list.add("Hong");
		//add해서 더해진 데이터를 
		//.get으로 꺼내기!
		//이것이 제너릭을 사용한 방법!
		String str1 = (String)list.get(0);
		String str2 = (String)list.get(1);
		String str3 = (String)list.get(2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
