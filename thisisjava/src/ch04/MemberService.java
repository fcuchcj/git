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
		
		String id2=search(id);
	}
	
	private String search(String id) {
		return null;
	}
	
	public void memberPrint() {
		for(int i=0;i<curr;i++) 
			System.out.println(memberInfo[i]);
		
	}
}
