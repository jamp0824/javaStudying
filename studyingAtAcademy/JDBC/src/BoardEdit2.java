import java.util.Scanner;

import net.abc.dao.BoardDAOImpl;
import net.abc.vo.BoardVO;

public class BoardEdit2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("게시판 번호 입력>>");
		int no=Integer.parseInt(sc.nextLine());
		BoardDAOImpl bdao=new BoardDAOImpl();
		BoardVO dbNo=bdao.getFindNo(no);//오라클로부터 번호값 검색
		if(dbNo != null) {
			System.out.println("검색된 번호값: "+dbNo.getB_no());
			System.out.println("수정할 이름>> ");
			String name=sc.nextLine();
			System.out.println("수정할 제목>> ");
			String title=sc.nextLine();
			System.out.println("수정할 내용>> ");
			String cont=sc.nextLine();

			BoardVO eb = new BoardVO();
			eb.setB_no(no); eb.setB_name(name); eb.setB_title(title); eb.setB_cont(cont);
			int re=bdao.updateBoard(eb); //게시물 수정
			if(re==1) {
				System.out.println("수정 성공함");
			}
		}else {
			System.out.println("검색번호 없어서 수정못함");
		}
	}

}
