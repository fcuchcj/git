package ch02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;

public class Lebron {
	public static void main(String[] args) {
		Collection<String> collection = new HashSet<>(); //collection을 제외한 자료구조는 아무 것이나 올 수 있다!
		//Collection으로 구현 가능한 인터페이스들을 다 외울 필요는 없다!
		collection.add("kim");
		collection.add("Lee");
		collection.add("Hong");
		/*형식을 ArrayList로 만들었지만, 참조하고 있는 것이 Collection
		 */
		// colletion,get(0); 이것은 List에만 있는 메서드이고, collection에는 없는 메서드이므로, 
		//출력이 안됨!
		System.out.println(collection.size());
		//컬렉션에 있는 모든 것을 가지고 오기 위해 Iterator을 사용!
		//Iterator을 사용하면 (=Iterator<String>) collection 안에 iterator()메서드를 사용할 수 있음!
		Iterator<String> iter = collection.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			//참일 때 나오는 것이므로 꺼낼 것이 있으면,
			//1개를 꺼냄!
			System.out.println(str);
		}
	}
}
