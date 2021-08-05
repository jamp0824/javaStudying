import java.util.List;

import com.naver.dao2.GuestDAOImpl2;
import com.naver.vo2.GuestVO2;


public class GuestList2 {
	public static void main(String[] args) {
		
		GuestDAOImpl2 gdao=new GuestDAOImpl2();
		List<GuestVO2> blist=gdao.getGuList(); //게시물 목록 가져옴
		System.out.println("no \t title \t name \t cont \t date");
		System.out.println("==================================>");
		if((blist !=null)&&(blist.size()>0)) {
			for(GuestVO2 g: blist) {
				System.out.println(g.getG_no()+"\t"+g.getG_title()+"\t"+g.getG_name()+"\t"
						+g.getG_cont()+"\t"+g.getG_date());
			}//for
			}else {
				System.out.println("게시판 목록이 없습니다!");
		}
	}

}
