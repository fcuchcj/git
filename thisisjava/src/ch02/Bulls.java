package ch02;

import java.util.ArrayList;

import java.util.List;

public class Bulls {
	
	public static void main(String[] args) {

		//ArrayList 컬렉션 생성

		//List 객체들을 동적으로 처리 가능: ArratList

		List<Board> list = new ArrayList<>();

		//객체 추가, List 인터페이스를 이용해서 ArrayList 객체를 만듬!

		//Board클래스를 타입으로 받음!(Board 객체만 받을 수 있다!)

		list.add(new Board("제목1","내용1","글쓴이1"));

		list.add(new Board("제목2","내용2","글쓴이2"));

		list.add(new Board("제목3","내용3","글쓴이3"));

		list.add(new Board("제목4","내용4","글쓴이4"));

		list.add(new Board("제목5","내용5","글쓴이5"));

		//지정된 총 객체 수 얻기!

		int size = list.size(); //메서드의 값을 size 변수에 대입!

		System.out.println("총 객체 수:"+size);

		System.out.println(); //1줄 띄어쓰기!

		//특정 인덱스의 객체 가져오기

		Board board = list.get(2); //.get() 특정 인덱스의 데이터를 불러

		//옴!
		//가져온 index 2번 데이터 출력!
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		System.out.println();
		//모든 객체를 하나씩 가져오기
		for(int i=0;i<list.size();i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
			}
		System.out.println();
		//객체 삭제
		list.remove(2);
		list.remove(2);
		//결과보기 
		for(Board b:list) {
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
			}
		}

	}

