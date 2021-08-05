

import java.util.List;

import net.daum.dao.BoardDAOImpl;
import net.daum.vo.BoardVO;

public class BoardList {
	public static void main(String[] args) {


		BoardDAOImpl dbao=new BoardDAOImpl();
		List<BoardVO>blist=dbao.getBoardList();
		/* 문제1) 다음과 같은 출력결과물이 나오는 게시판 목록을 가져오는 getBoardList()메서드를 작성하자
		 * 		제목1 - 내용1
		 * 		제목2 - 내용2
		 * 문제2) main()메서드에서 향상된 확장 for 반복문을 사용하여 위의 게시판 목록 출력물을 나오게 하자.	
		 */	
		//향상된for문 코드작성

		for(BoardVO bv: blist) {
			System.out.print(bv.getTitle());
			System.out.print(" - ");
			System.out.print(bv.getContent());
			System.out.println();
		}



	}



}
