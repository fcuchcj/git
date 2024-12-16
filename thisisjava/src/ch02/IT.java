package ch02;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IT {
public static void main(String[] args) {
	Set<String> set = new HashSet<>(); //collection을 제외한 자료구조는 아무 것이나 올 수 있다!
	//Collection으로 구현 가능한 인터페이스들을 다 외울 필요는 없다!
	boolean flag1 = set.add("kim");
	boolean flag2 = set.add("Lee");
	boolean flag3 =set.add("Hong");
	boolean flag4 =set.add("Hong");
	
	System.out.println(flag1);
	System.out.println(flag2);
	System.out.println(flag3);
	System.out.println(flag4);
	//같은 값 갯수 안 침!
	/*형식을 ArrayList로 만들었지만, 참조하고 있는 것이 Collection
	 */
	// colletion,get(0); 이것은 List에만 있는 메서드이고, collection에는 없는 메서드이므로, 
	//출력이 안됨!
	System.out.println(set.size());
	//컬렉션에 있는 모든 것을 가지고 오기 위해 Iterator을 사용!
	//Iterator을 사용하면 (=Iterator<String>) collection 안에 iterator()메서드를 사용할 수 있음!
	Iterator<String> iter = set.iterator();
	while(iter.hasNext()) {
		String str = iter.next();
		//참일 때 나오는 것이므로 꺼낼 것이 있으면,
		//1개를 꺼냄!
		System.out.println(str);
	}
}
}
