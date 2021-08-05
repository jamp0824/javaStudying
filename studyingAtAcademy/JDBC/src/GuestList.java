import java.util.List;

import com.naver.dao.GuestDAOImpl;
import com.naver.vo.GuestVO;

import net.abc.vo.BoardVO;


public class GuestList {
	public static void main(String[] args) {
		
		GuestDAOImpl gdao=new GuestDAOImpl();
		List<GuestVO> blist=gdao.getGuestList(); //게시물 목록 가져옴
		System.out.println("no \t title \t name \t pwd \t cont \t date");
		System.out.println("==================================>");
		if((blist !=null)&&(blist.size()>0)) {
			for(GuestVO g: blist) {
				System.out.println(g.getG_no()+"\t"+g.getG_title()+"\t"+g.getG_name()+"\t"
						+g.getG_pwd()+"\t+"+g.getG_cont()+"\t"+g.getG_date());
			}//for
			}else {
				System.out.println("게시판 목록이 없습니다!");
		}
	}

}