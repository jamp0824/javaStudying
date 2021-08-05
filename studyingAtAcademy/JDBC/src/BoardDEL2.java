import java.util.Scanner;

import net.abc.dao.BoardDAOImpl;
import net.abc.vo.BoardVO;

public class BoardDEL2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("게시판 번호 입력>>");
	int no=Integer.parseInt(sc.nextLine());
	BoardDAOImpl dbao=new BoardDAOImpl();
	BoardVO dbNo=dbao.getFindNo(no);
	
	if(dbNo==null) {
		System.out.println("검색번호가 없어서 삭제 못합니다.!");
		
	}else {
		int re=dbao.delBoard(no); //게시물 삭제
		if(re==1) {
			System.out.println("삭제 성공!");
		}//if
	}//if else
}//main()
}
