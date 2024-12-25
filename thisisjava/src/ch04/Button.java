package ch04;

public class Button {
	//버튼이 클릴 될 떄 발생하는 이벤트를 이 구현 객체를 이
	//용해서 사용!
	static interface onClickListener{
		void onClick();
	}
	//이 인터페이스 타입으로 필드 생성하기!
	onClickListener listen;
	//이 필드를 대입하기 위해서 set을 만듬!, 그러면 안에 있는 onClick 메서드를 
	//listen 변수 값으로 호출가능!
	void setonClickListener(onClickListener listen) {
		this.listen=listen;
	}
	
	void touch() {
		listen.onClick();
	}
	
}
