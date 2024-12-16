package ch02;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_9 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0;i<objArr.length;i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));	
		}
		//HashSet에 저장된 요소들을 출력!	
		System.out.println(set);
		
		//HashSet에 저장된 요소들을 Iterator을 이용해 출력!
		//set을 가지고 와서 it변수로 Iterator을 이용해서 
		//빼내기!
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
