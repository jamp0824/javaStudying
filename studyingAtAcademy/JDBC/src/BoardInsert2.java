import java.util.Scanner;

import net.abc.dao.BoardDAOImpl;
import net.abc.vo.BoardVO;

public class BoardInsert2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게시물 저장하기");
		System.out.println("작성자 입력>>");
		String b_name=sc.nextLine();
		System.out.println("제목 입력>>");
		String b_title=sc.nextLine();
		System.out.println("내용 입력>>");
		String b_cont=sc.nextLine();
		
		BoardVO b=new BoardVO();
		b.setB_name(b_name); b.setB_title(b_title); b.setB_cont(b_cont);
		BoardDAOImpl bdao= new BoardDAOImpl();
		bdao.insertBoard(b); //게시물저장
	}

}
