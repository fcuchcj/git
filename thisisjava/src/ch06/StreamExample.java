package ch06;

import java.util.Set;
import java.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;

public class StreamExample {
	public static void main(String[] args) {
		//문자열이 저장된 set컬렉션을 만들어 보기!
		//set안에 hashset을 만들기!
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김길동");
		set.add("감자바");
		//외부반복자를 이용해서 처리하는 방법!
		for(String item : set) {
			System.out.println(item);
		}
		//출력값 개행하기!
		System.out.println("\n");
		//외부반복자(Iterator) 이용!
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			//가져와서 어떻게 출력할 것입니까?
			System.out.println(item);
		}
		//내부반복자 이용하기!,Stream 이용하기!
		Stream<String> stream = set.stream();
		//stream안에 있는 객체를 내가 주는 람다식으로 처리해!
		stream.forEach((item)->
			System.out.println(item));
	}
}
