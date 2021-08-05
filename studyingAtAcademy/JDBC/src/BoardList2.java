import java.util.List;

import net.abc.dao.BoardDAOImpl;
import net.abc.vo.BoardVO;

public class BoardList2 {
	public static void main(String[] args) {
		
		BoardDAOImpl bdao=new BoardDAOImpl();
		List<BoardVO> blist=bdao.getBoardList(); //게시물 목록 가져옴
		System.out.println("no \t title \t name \t cont \t date");
		System.out.println("==================================>");
		if((blist !=null)&&(blist.size()>0)) {
			for(BoardVO b: blist) {
				System.out.println(b.getB_no()+"\t"+b.getB_title()+"\t"+b.getB_name()+"\t"
						+b.getB_cont()+"\t+"+b.getB_date());
			}//for
			}else {
				System.out.println("게시판 목록이 없습니다!");
		}
	}

}
