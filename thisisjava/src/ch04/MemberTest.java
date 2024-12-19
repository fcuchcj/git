package ch04;

public class MemberTest {
	public static void main(String[] args) {
		int sel = 0;
		//무한루프는 while 조건을 true로 만듬!
		/*
		 * int sel = 0; while(true) { //메뉴출력 MenuShow.mainMenu(args); //메뉴선택
		 * sel=MenuShow.SC.nextInt(); }
		 */
		System.out.println("이름:");
		sel =MenuShow.VO.nextInt();
		MenuShow.VO.nextLine();
		
		switch (sel) {
		case 1:
			System.out.println("자료입력...");
			break;
		case 2:
			System.out.println("자료출력...");
			break;
		case 3:
			System.out.println("종료");
			default:
				break;
		}
		
	}	
}
