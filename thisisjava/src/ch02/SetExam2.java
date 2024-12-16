package ch02;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetExam2 {
	public static void main(String[] args) {
		Set<MyData> mySet = new HashSet<>();
		//list는 get(index,value)
		//Set은 add(
		mySet.add(new MyData("Kim",500));
		mySet.add(new MyData("John",300));
		mySet.add(new MyData("Oneal",350));
		
		Iterator<MyData> iterator = mySet.iterator();
		while(iterator.hasNext()) {
			MyData myData = iterator.next();
			System.out.println(myData);
		}
	}
}

class MyData{
	private String name;
	private int value;
	
	public MyData(String name,int value) {
		this.name=name;
		this.value=value;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getValue() {
		return value;
	}
	
	
	
}


	