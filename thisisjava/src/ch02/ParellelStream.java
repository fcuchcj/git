package ch02;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ParellelStream {

	public static void main(String[] args) {
		/*스트림에서 병렬처리는 동일한 것은 병렬로 처리하는 것이 아니고,(1개의
		 * 객체는 1번 처리! 1~30번, 31~60번 까지 이런 식으로 1번씩만!) 
		 */
		List<String> list = new ArrayList<>();
		for(int i =0;i<1000;i++) {
			list.add("홍길동"+i);
		}
		/*하나의 스트림이 아니고, 멀티스트림을 만들어서, 병렬적으로 처리하고
		 * 싶으면, list.stream()을 하면 이것은 싱글스트림!
		 */
		Stream<String> stream = list.stream();
		stream.forEach(name->{
			//Thread.currentThread(): 이 부분이 현재 Thread객체!
			Thread thread = Thread.currentThread();
			System.out.println(name+":"+thread.getName());});
		}
 
}
