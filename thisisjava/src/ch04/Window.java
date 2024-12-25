package ch04;

public class Window {
	Button bt = new Button();
	Button bt2 = new Button();
	//다른파일 (=Button)에 있는 필드 불러오기!
	//인터페이스로 필드를 하나 만들었기에 해당 필드를 부르면,
	//인터페이스 안에 메서드도 오버라이딩 되어서 쓸 수 있음!
	Button.onClickListener listen=new Button.onClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		bt.setonClickListener(listen);
		//데이터 조작을 위해 set을 씀!
		bt2.setonClickListener(new Button.onClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
