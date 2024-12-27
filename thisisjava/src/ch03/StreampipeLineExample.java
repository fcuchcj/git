package ch03;

import java.util.Arrays;
import java.util.List;

public class StreampipeLineExample {

	public static void main(String[] args) {
		//Arrays.asList()는 배열로부터 고정적인 List를 얻는 메서드!
		//List<String> list = Array.asList();
		List<Student> list = List.of(
			new Student("홍길동",10),
			new Student("홍길동",20),
			new Student("홍길동",30)			
		);
		//List.of()는 수정이 불가능한 List를 얻을 수 있음!	
		double avg = list.stream()
				.mapToInt(student->student.getScore())
				.average()
				.getAsDouble();
		System.out.println("평균점수:"+avg);
	}
	//학생들의 평균값을 구할려면, 
	
	//이 stream안에는 list안에 있는 값들이 흘러간다!
	//흘러가고 있는 Student로는 평균을 구할 수 없으니까, 
			//점수로 바꾸어야 한다!
}
