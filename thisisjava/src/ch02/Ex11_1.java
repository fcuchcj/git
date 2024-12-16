package ch02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex11_1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); //중복이라 저장 안 됨!
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
	}
}

class Person {
	String name;
	int age;
	/*hash code와 equals를 오버라이드하면, David:10가 1번 출력!
	 */
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age==p.age;
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return name +":"+age;
	}
}
