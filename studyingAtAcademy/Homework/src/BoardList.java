import java.util.List;
import java.util.Scanner;

import net.abc.vo.BoardVO;

public class BoardList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게시물 저장하기");
		System.out.println("작성자 입력>>");
		String g_name=sc.nextLine();
		System.out.println("제목 입력>>");
		String g_title=sc.nextLine();
		System.out.println("내용 입력>>");
		String g_cont=sc.nextLine();
		
		BoardVO bv = new BoardVO();
		bv.setB_name(g_name);bv.setB_title(g_title);bv.setB_cont(g_cont);
		BoardDAOImpl bdao= new BoardDAOImpl();
		bdao.insertBoard(bv);
		//게시판 저장
		List<BoardVO>blist=bdao.getBoardList();
		
		bdao.getBoardList(); 
	}

}
