package ch02;

import java.util.*;
//해시맵
public class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "5678");
		System.out.println(map);
		map.put("asdf", "0000");
		//map.put("","")에서 첫번째 값이 id 두번쨰 값이 
		//password
		System.out.println(map);
		//데이터 입력 받기, 순서 유지 X
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id:");
			String id = sc.nextLine().trim();
			//Scanner의 변수를 받음 (=sc)
			//.trim(): 공백 제거!
			
			System.out.println("password:");
			String password = sc.nextLine().trim();
			System.out.println();
		
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다.");
				continue;
			}
			
			if(!("1234").equals("1234")) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치하지 않습니다.");
				break;
			}
		}
	}`
}
