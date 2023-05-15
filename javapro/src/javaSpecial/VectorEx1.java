package javaSpecial;

import java.util.List;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("코로나", "코로나 격리 1주일 의무", "홍길동"));
		list.add(new Board("자바구현", "스마트폰으로 구현", "김철수"));
		list.add(new Board("자바응용평가", "클래스,인터페이스 .... API", "이영희"));
		
		for(int i=0;i<list.size();i++) {
			Board board = list.get(i);
			System.out.println("제목 : "+board.subject);
			System.out.println("내용 : "+board.content);
			System.out.println("글쓴이 : "+board.writer);
			System.out.println("=============================");
		}

	}

}
