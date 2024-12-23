package ch04;

public class MemberService {
	final int MAX_SIZE = 50;
	int curr=0;
	MemberDTO[] memberInfo = new MemberDTO[MAX_SIZE];
	
	
	public void inputData() {
		System.out.println("ID:");
		String id = MenuShow.VO.nextLine();
		System.out.println("PWD:");
		String pwd = MenuShow.VO.nextLine();
		System.out.println("NAME:");
		String name = MenuShow.VO.nextLine();
		System.out.println("EMAIL:");
		String email = MenuShow.VO.nextLine();
		
	//입력 완료 후 객체를 생성: 1개의 객체
	MemberDTO mDto = new MemberDTO(id,pwd,name,email);
	//배열에 객체를 저장
	memberInfo[curr++]=new MemberDTO(id,pwd,name,email);
	System.out.println("자료가 저장됨");
	
	}
	public void searchData() {
		System.out.println("id:");
		String id = MenuShow.VO.nextLine();
		// 검색 메소드
		int id2 = search("id :");
		if (id2<0) 
			System.out.println("해당 데이터가 존재하지 않음");
		else {
			memberInfo[id2].display();
			System.out.println("데이터 검색 완료...");
		}
	}
	
	public void deleteData() {
		System.out.println("id:");
		String id = MenuShow.VO.nextLine();
		
		int id2 = search(id);
		if(id2<0) 
			System.out.println("해당 데이터가 존재하지 않음");
		else {
			for(int i=0;i<curr;i++) {
				memberInfo[i] = memberInfo[i+1];
			}
			curr--;
			System.out.println("데이터 삭제 완료...");
		}
	}
	
	public int search(String id) {
		for(int i=0;i<curr;i++) { 
		MemberDTO dto = memberInfo[i];
		if(id.equals(dto.getId()))
			return i;
		}
		return -1;
	}

public void memberPrint() {
	for(int i = 0; i<curr;i++) 
		System.out.println(memberInfo[i]);
	}
}
